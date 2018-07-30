package com.gara.hellodemo.cotroller;

import com.gara.hellodemo.cotroller.base.BaseController;
import com.gara.hellodemo.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.UUID;

@RestController
public class UserController extends BaseController {


    @RequestMapping("/user")
    public User getUserLists(){

        User user = new User();
        user.setUserId(UUID.randomUUID().toString());
        user.setUserName("张三");
        user.setAge(24);
        return user;
    }

    @RequestMapping(value = "/get")
    public HashMap<String,Object> get(@RequestParam String name){
        HashMap<String,Object> hashMap = new HashMap<String,Object>();
        hashMap.put("title","hello world!");
        hashMap.put("name",name);
        return hashMap;
    }
}
