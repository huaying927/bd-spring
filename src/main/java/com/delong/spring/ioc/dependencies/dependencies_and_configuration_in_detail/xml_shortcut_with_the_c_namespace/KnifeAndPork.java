package com.delong.spring.ioc.dependencies.dependencies_and_configuration_in_detail.xml_shortcut_with_the_c_namespace;

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
