package com.delong.spring.ioc.java_based_container_configuration.c_9;


public class American implements IHuman
{
    private Tool tool;

    public American (Tool tool)
    {
        this.tool = tool;
    }

    @Override
    public void eatUseTool ()
    {
        this.tool.getToolName();
    }
}
