package com.gara.hellodemo.redis;

import org.springframework.boot.autoconfigure.cache.CacheProperties;
import redis.clients.jedis.Jedis;

import java.util.Set;

/**
 * @description: TODO
 * @author: GaraYing
 * @create: 2018-08-27 17:07
 **/

public class RedisTest {

    public static void main(String[] args) {
        try {
            Jedis jedis = RedisUtils.getJedis();

            System.out.println(jedis.getrange("myset", 0, -1).length());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
