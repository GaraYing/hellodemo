package com.gara.hellodemo.utils;

import org.springframework.util.StringUtils;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description: 时间格式化工具 小哥哥加点注释吧~
 * @author: GaraYing
 * @create: 2018-08-03 10:12
 **/
public class CustomDateConverter {
    public static String formatDateParm(Date date) {
        String result = null;
        SimpleDateFormat dateFormat = null;
        try {
            dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //HH:24小时制  hh:12小时制
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (!StringUtils.isEmpty(date)){
            result = dateFormat.format(date);
        }
        return result;
    }

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("========================");
        System.out.println(formatDateParm(date));
    }
}
