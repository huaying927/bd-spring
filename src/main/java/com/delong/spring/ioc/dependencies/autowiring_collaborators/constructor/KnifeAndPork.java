package com.delong.spring.ioc.dependencies.autowiring_collaborators.constructor;

public class KnifeAndPork implements Tools
{
    private String toolName;

    public KnifeAndPork(String toolName)
    {
        this.toolName = toolName;
    }

    @Override
    public void toolName()
    {
        System.out.println("美国人吃饭用的工具是：" + this.toolName);
    }
}
