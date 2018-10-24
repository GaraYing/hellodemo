package com.gara.hellodemo.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @description:
 * @author: GaraYing
 * @create: 2018-10-09 19:03
 **/

public class IocDemo implements ApplicationContextAware {
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        // 获取IOC容器
//        applicationContext.getBean(arg0);
    }
}
