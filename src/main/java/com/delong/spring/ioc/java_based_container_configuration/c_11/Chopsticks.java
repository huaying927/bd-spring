package com.delong.spring.ioc.java_based_container_configuration.c_11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Chopsticks implements Tool
{
    private String toolName;

    @Autowired
    @Value("chopsticks")
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
