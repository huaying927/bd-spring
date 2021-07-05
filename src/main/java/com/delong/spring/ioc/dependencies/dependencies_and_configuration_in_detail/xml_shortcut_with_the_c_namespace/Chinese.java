package com.delong.spring.ioc.dependencies.dependencies_and_configuration_in_detail.xml_shortcut_with_the_c_namespace;

public class Chinese implements IHuman
{
    private Tool tool;

    public Chinese (Tool tool)
    {
       this.tool = tool;
    }

    @Override
    public void eatTools ()
    {
        this.tool.toolName();
    }
}
