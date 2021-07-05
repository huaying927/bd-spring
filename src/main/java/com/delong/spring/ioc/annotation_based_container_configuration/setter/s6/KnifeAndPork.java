package com.delong.spring.ioc.annotation_based_container_configuration.setter.s6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class KnifeAndPork implements Tool
{
    private String toolName;

    @Autowired
    @Value("knife and pork")
    public void setToolName (String toolName)
    {
        this.toolName = toolName;
    }

    @Override
    public void getToolName ()
    {
        System.out.println("美国人吃饭用的工具是："+this.toolName);
    }
}
