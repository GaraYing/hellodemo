package com.gara.hellodemo.cotroller;

import com.gara.hellodemo.cotroller.base.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController extends BaseController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
