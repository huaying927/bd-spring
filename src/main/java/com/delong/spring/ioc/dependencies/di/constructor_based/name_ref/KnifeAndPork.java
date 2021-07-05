package com.delong.spring.ioc.dependencies.di.constructor_based.name_ref;

public class KnifeAndPork implements Tool
{
    private String toolName;

    public KnifeAndPork (String toolName)
    {
        this.toolName = toolName;
    }

    @Override
    public void toolName ()
    {
        System.out.println("美国人吃饭用的工具是: " + this.toolName);
    }
}
