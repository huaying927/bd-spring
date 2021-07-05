package com.delong.spring.ioc.dependencies.autowiring_collaborators.by_name;

public class Chopsticks implements Tools
{
    private String toolName;

    public void setToolName(String toolName)
    {
        this.toolName = toolName;
    }

    @Override
    public void toolName()
    {
        System.out.println("中国人吃饭用的工具是：" + this.toolName);
    }
}
