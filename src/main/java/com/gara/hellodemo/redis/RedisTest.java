package com.gara.hellodemo.redis;

import org.springframework.boot.autoconfigure.cache.CacheProperties;
import redis.clients.jedis.Jedis;

import java.util.LinkedHashSet;
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

            Set<String> set = new LinkedHashSet<>();
            set.add("sss");
            System.out.println(jedis.getrange("myzset", 0, -1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
