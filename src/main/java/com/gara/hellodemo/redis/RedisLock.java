package com.gara.hellodemo.redis;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.util.StringUtils;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

import java.util.List;
import java.util.UUID;

/**
 * @author GARA
 * @Title: RedisLock
 * @ProjectName hellodemo
 * @Description: Redis实现分布式锁
 * @date 2018/8/26 16:30
 */
public class RedisLock {

    /**
     * 获取锁
     *
     * @param key
     * @param timeout 失效时间
     * @return
     */
    public String getLock(String key, int timeout) {


        try {
            Jedis jedis = RedisUtils.getJedis();
            long end = System.currentTimeMillis() + timeout;
            String value = UUID.randomUUID().toString();
            while (System.currentTimeMillis() < end) { // 阻塞
                if (jedis.setnx(key, value) == 1) {
                    jedis.expire(key, timeout);
                    // 锁设置成功 redis 设置成功
                    return value;
                }
                if (jedis.ttl(key) == -1) {//检测过期时间
                    jedis.expire(key, timeout);
                }
            }
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;

    }

    /**
     * 释放锁
     *
     * @param key
     * @param value
     * @return
     */
    public Boolean releaseLock(String key, String value) {

        try {
            Jedis jedis = RedisUtils.getJedis();
            while (true) {
                jedis.watch(key);// 监控一个或者多个key,如果key被修改或者删除，后面的事务代码就不会删除

                if (value.equals(jedis.get(key))) { // 确保获取锁的线程和当前Redis中存在的锁是同一个
                    Transaction transaction = jedis.multi();
                    transaction.decr(key);
                    List<Object> list = transaction.exec();

                    if (list == null) {
                        continue;
                    }
                    return true;
                }

                jedis.unwatch();
                break;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void main(String[] args) {
        RedisLock redisLock = new RedisLock();
        String lockId = redisLock.getLock("lock:aef", 10000);
        if (lockId != null)
            System.out.println("Redis获取锁成功 " + lockId);

        String l = redisLock.getLock("lock:aef", 10000);
        System.out.println(l);
    }
}
