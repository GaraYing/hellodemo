package com.gara.hellodemo.cotroller;

import com.gara.hellodemo.domain.Message;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/**
 * @description:
 * @author: GaraYing
 * @create: 2018-09-06 14:08
 **/

@RestController
@RequestMapping
public class MessageController {

//    public Flux<Message> allMessage() {
//        return Flux.just(
//            Message.builder().body("hello Spring 5").build(),
//            Message.builder().body("hello Spring Boot 2").build()
//        );
//    }
}
