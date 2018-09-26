package com.gara.hellodemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloDemoApplication {

    /*
        自描述信息：（Accept）
            源码路径 EnableWebMvc -> DelegatingWebMvcConfiguration -> WebMvcConfigurationSupport # addDefaultHttpMessageConverters
            所有的HTTP自描述信息处理器均在MessageConverters ，这个集合会传递到 RequestMappingHandlerAdapter，最终控制输出
            以application/json为例，Spring Boot默认使用Jackson2的序列化方法，其中媒体类型：application/json,它的处理类
            MappingJackson2XmlHttpMessageConverter 提供两类方法
            1. 读read*: 通过Http请求内容转换成对应的Bean
            2. 写write*: 通过Bean序列化成对应文本内容作为响应内容
    */

    public static void main(String[] args) {
        SpringApplication.run(HelloDemoApplication.class, args);
    }
}
