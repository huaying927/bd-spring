package com.delong.spring.ioc.dependencies.dependencies_and_configuration_in_detail.references_to_other_beans;

public class KnifeAndPork implements Tool
{
    private String toolName;

    public void setToolName (String toolName)
    {
        this.toolName = toolName;
    }

    @Override
    public void toolName ()
    {
        System.out.println("美国人吃饭用的工具是: " + this.toolName);
    }
}
