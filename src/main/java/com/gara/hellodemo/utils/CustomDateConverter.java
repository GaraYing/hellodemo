package com.gara.hellodemo.utils;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description: 时间格式化工具 小哥哥加点注释吧~
 * @author: GaraYing
 * @create: 2018-08-03 10:12
 **/
public class CustomDateConverter {
    public static String  formatDateParm(Date date){
        SimpleDateFormat dateFormat = null;
        try {
            dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //HH:24小时制  hh:12小时制
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dateFormat.format(date);
    }

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("========================");
        System.out.println(formatDateParm(date));
    }
}
