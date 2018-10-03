package com.gara.hellodemo.config;

import com.gara.hellodemo.http.message.PropertiesPersonHttpMessageConverter;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * @author GARA
 * @Title: MyWebMvcConfigurer 配置用于扩展自描述信息
 * @ProjectName hellodemo
 * @Description: TODO
 * @date 2018/9/27 23:36
 */
@Configuration
@EnableWebMvc
public class MyWebMvcConfigurer implements WebMvcConfigurer {
    /**
     *
     0 = {ByteArrayHttpMessageConverter@6024}
     1 = {StringHttpMessageConverter@6025}
     2 = {ResourceHttpMessageConverter@6026}
     3 = {ResourceRegionHttpMessageConverter@6027}
     4 = {SourceHttpMessageConverter@6028}
     5 = {AllEncompassingFormHttpMessageConverter@6029}
     6 = {MappingJackson2XmlHttpMessageConverter@6030}
     7 = {MappingJackson2HttpMessageConverter@6031}
     *
     * @param converters
     */
    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
//        converters.add(new MappingJackson2XmlHttpMessageConverter());
//        converters.set(0, new MappingJackson2XmlHttpMessageConverter());
        converters.add(new PropertiesPersonHttpMessageConverter());
    }
}