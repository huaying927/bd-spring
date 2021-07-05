package com.delong.spring.ioc.dependencies.di.setter_based.name_ref;

public class Chopsticks implements Tool
{
    private String toolName;

    public void setToolName (String toolName)
    {
        this.toolName = toolName;
    }

    @Override
    public void toolName ()
    {
        System.out.println("中国人吃饭用的工具是: " + this.toolName);
    }
}
