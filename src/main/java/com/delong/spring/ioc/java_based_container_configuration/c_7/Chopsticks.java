package com.delong.spring.ioc.java_based_container_configuration.c_7;

public class Chopsticks implements Tool
{
    private String toolName;

    public Chopsticks (String toolName)
    {
        this.toolName = toolName;
    }

    @Override
    public void getToolName ()
    {
        System.out.println("中国人吃饭用的工具是：" + this.toolName);
    }
}
