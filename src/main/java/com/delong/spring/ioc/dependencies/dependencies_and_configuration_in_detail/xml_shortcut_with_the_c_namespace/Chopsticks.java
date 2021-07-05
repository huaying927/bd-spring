package com.delong.spring.ioc.dependencies.dependencies_and_configuration_in_detail.xml_shortcut_with_the_c_namespace;

public class Chopsticks implements Tool
{
    private String toolName;

    public Chopsticks (String toolName)
    {
        this.toolName = toolName;
    }

    @Override
    public void toolName ()
    {
        System.out.println("中国人吃饭用的工具是: " + this.toolName);
    }
}
