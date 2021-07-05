package com.delong.spring.ioc.java_based_container_configuration.c_6;

import org.springframework.beans.factory.annotation.Autowired;


public class Chinese implements IHuman
{
    private Tool tool;

    @Autowired
    public void setTool (Tool tool)
    {
        this.tool = tool;
    }

    @Override
    public void eatUseTool ()
    {
        this.tool.getToolName();
    }
}
