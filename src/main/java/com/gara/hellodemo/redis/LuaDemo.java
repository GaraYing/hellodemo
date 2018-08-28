package com.gara.hellodemo.redis;

import redis.clients.jedis.Jedis;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: LUA脚本执行redis
 * @author: GaraYing
 * @create: 2018-08-28 15:23
 **/

public class LuaDemo {

    public static void main(String[] args) {

        String lua ="local num = redis.call('incr',KEYS[1])\n" +
                "if tonumber(num)==1 then\n" +
                "        redis.call('expire',KEYS[1],ARGV[1])\n" +
                "        return 1\n" +
                "elseif tonumber(num)>tonumber(ARGV[2]) then\n" +
                "        return 0\n" +
                "else\n" +
                "        return 1\n" +
                "end";


        try {
            Jedis jedis = RedisUtils.getJedis();

//            Object sha = jedis.evalsha(lua);

            String shaload = jedis.scriptLoad(lua);// 先让redis缓存

            List<String> keys = new ArrayList<>();
            List<String> argss = new ArrayList<>();

            keys.add("ip:limit:127.0.0.1");
            argss.add("6000");
            argss.add("10");

            Object object = jedis.evalsha(shaload,keys,argss);

            System.out.println(object);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
