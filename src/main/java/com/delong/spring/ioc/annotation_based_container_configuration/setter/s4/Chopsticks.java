package com.delong.spring.ioc.annotation_based_container_configuration.setter.s4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("chopsticks")
public class Chopsticks implements Tool
{
    @Value("BigData")
    private String toolName;


    @Override
    public void getToolName ()
    {
        System.out.println("中国人吃饭用的工具是：" + this.toolName);
    }
}
