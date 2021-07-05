package com.delong.spring.ioc.dependencies.autowiring_collaborators.by_type;

public class KnifeAndPork implements Tools
{
    private String toolName;

    public void setToolName(String toolName)
    {
        this.toolName = toolName;
    }

    @Override
    public void toolName()
    {
        System.out.println("美国人吃饭用的工具是：" + this.toolName);
    }
}
