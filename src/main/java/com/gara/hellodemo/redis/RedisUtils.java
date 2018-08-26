package com.gara.hellodemo.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @author GARA
 * @Title: RedisUtils
 * @ProjectName hellodemo
 * @Description: Redis 管理
 * @date 2018/8/26 16:38
 */
public class RedisUtils {

    private static JedisPool jedisPool;

    static {
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxIdle(20);
        jedisPoolConfig.setMaxTotal(20);
        jedisPool = new JedisPool(jedisPoolConfig,"127.0.0.1",6379);
    }

    public static Jedis getJedis() throws Exception{
        if (jedisPool != null){
            return  jedisPool.getResource();
        }
        throw new Exception("JedisPool was not init");
    }
}
