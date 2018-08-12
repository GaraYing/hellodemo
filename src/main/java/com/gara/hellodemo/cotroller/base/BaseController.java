package com.gara.hellodemo.cotroller.base;


import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @program: redisdemo
 * @description: 小哥哥加点注释吧~
 * @author: GaraYing
 * @create: 2018-07-26 14:33
 **/
public class BaseController {

    public Map<String, Object> initMessage() {
        Map<String, Object> map = new LinkedHashMap<String, Object>();
        map.put("success", true);
        map.put("error", null);
        map.put("errorCode", 100);
        map.put("data", null);
        return map;
    }

    /**
     * 出错
     *
     * @param error
     * @param errorCode
     * @param map
     */
    protected void ERROR(String error, int errorCode, Map<String, Object> map) {
        map.put("success", false);
        map.put("error", error);
        map.put("errorCode", errorCode);
    }
}
