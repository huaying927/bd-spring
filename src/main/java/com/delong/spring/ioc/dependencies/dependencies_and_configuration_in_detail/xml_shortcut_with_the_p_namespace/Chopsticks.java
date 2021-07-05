package com.delong.spring.ioc.dependencies.dependencies_and_configuration_in_detail.xml_shortcut_with_the_p_namespace;

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
