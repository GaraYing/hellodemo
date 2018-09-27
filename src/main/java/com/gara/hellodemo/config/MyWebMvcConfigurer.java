package com.gara.hellodemo.config;

import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * @author GARA
 * @Title: MyWebMvcConfigurer
 * @ProjectName hellodemo
 * @Description: TODO
 * @date 2018/9/27 23:36
 */
@Configuration
@EnableWebMvc
public class MyWebMvcConfigurer implements WebMvcConfigurer {

    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
//        converters.add(new MappingJackson2XmlHttpMessageConverter());
        converters.set(0, new MappingJackson2XmlHttpMessageConverter());
    }
}