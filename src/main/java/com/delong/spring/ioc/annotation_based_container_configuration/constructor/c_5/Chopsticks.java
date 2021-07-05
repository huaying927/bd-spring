package com.delong.spring.ioc.annotation_based_container_configuration.constructor.c_5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("chops")
public class Chopsticks implements Tool
{
    private String toolName;

    @Autowired
    public Chopsticks (@Value("筷子") String toolName)
    {
        this.toolName = toolName;
    }

    @Override
    public void getToolName ()
    {
        System.out.println("中国人吃饭用的工具是：" + this.toolName);
    }
}
