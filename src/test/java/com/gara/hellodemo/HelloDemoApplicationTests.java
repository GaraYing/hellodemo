package com.gara.hellodemo;

import com.gara.hellodemo.cotroller.MessageController;
import com.gara.hellodemo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

@RunWith(SpringRunner.class)
//@WebFluxTest(controllers = MessageController.class)
@SpringBootTest
public class HelloDemoApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void contextLoads() {
        System.out.println("没有任何关系" + userService.getDate());
    }

//    @Autowired
//    WebTestClient client;
//
//    @Test
//    public void getAllMessagesShouldBeOK(){
//        client.get().uri("/").exchange().expectStatus().isOk();
//    }

}
