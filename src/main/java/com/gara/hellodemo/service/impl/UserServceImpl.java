package com.gara.hellodemo.service.impl;

import com.gara.hellodemo.service.UserService;
import com.gara.hellodemo.utils.CustomDateConverter;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @description: 用户实现类
 * @author: GaraYing
 * @create: 2018-08-09 15:04
 **/
@Service
public class UserServceImpl implements UserService {

    @Override
    public String checkParms(String... params) {
        return null;
    }

    @Override
    public String getDate() {
        Date date = new Date();
        return CustomDateConverter.formatDateParm(date);
    }
}
