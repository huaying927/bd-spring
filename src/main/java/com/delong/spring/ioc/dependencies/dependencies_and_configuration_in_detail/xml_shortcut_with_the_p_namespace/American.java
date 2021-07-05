package com.delong.spring.ioc.dependencies.dependencies_and_configuration_in_detail.xml_shortcut_with_the_p_namespace;

public class American implements IHuman
{
    private Tool tool;

    public void setTool (Tool tool)
    {
        this.tool = tool;
    }

    @Override
    public void eatTools ()
    {
       this.tool.toolName();
    }
}
