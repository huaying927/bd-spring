package com.delong.spring.ioc.annotation_based_container_configuration.constructor.c_4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class KnifeAndPork implements Tool
{
    private String toolName;

    public KnifeAndPork (@Value("knife and pork") String toolName)
    {
        this.toolName = toolName;
    }

    @Override
    public void getToolName ()
    {
        System.out.println("美国人吃饭用的工具是："+this.toolName);
    }
}
