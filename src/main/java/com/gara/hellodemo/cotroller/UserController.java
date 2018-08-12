package com.gara.hellodemo.cotroller;

import com.gara.hellodemo.cotroller.base.BaseController;
import com.gara.hellodemo.domain.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

@RestController
public class UserController extends BaseController {

    /** 
    * @Description: 默认返回Json字符串数据
    * @Param: []
    * @return: com.gara.hellodemo.domain.User
    * @Author: GaraYing
    * @Date: 2018/8/9 14:36
    */
    @RequestMapping("/user")
    public User getUserLists() {

        User user = new User();
        user.setUserId(UUID.randomUUID().toString());
        user.setUserName("张三");
        user.setBirthday(new Date());
        user.setGender("男");
        user.setAge(24);
        return user;
    }
    @ApiOperation(value="获取用户详情", notes="用户信息")
    @RequestMapping(value = "/get")
    public HashMap<String, Object> get(@RequestParam String name) {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put("title", "hello world!");
        hashMap.put("name", name);
        return hashMap;
    }
}
