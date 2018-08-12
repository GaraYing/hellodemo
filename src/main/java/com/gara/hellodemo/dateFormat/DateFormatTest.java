package com.gara.hellodemo.dateFormat;

import com.gara.hellodemo.domain.User;

import java.util.Date;
import java.util.UUID;

/**
 * @description: 日期格式化测试研究 小哥哥加点注释吧~
 * @author: GaraYing
 * @create: 2018-08-03 09:48
 **/
public class DateFormatTest {

    public static void main(String[] args) {
        User user = new User();
        user.setUserId(UUID.randomUUID().toString());
        user.setUserName("王二小");
        user.setAge(23);
        user.setGender("男");
        user.setBirthday(new Date());

        System.out.println(user);

    }
}
