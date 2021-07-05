package com.delong.spring.ioc.java_based_container_configuration.c_6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;


public class Chopsticks implements Tool
{
    private String toolName;

    @Autowired
    @Value("big-data")
    public void setToolName (String toolName)
    {
        this.toolName = toolName;
    }

    @Override
    public void getToolName ()
    {
        System.out.println("中国人吃饭用的工具是：" + this.toolName);
    }
}
