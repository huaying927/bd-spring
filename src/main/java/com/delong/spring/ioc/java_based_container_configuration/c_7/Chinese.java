package com.delong.spring.ioc.java_based_container_configuration.c_7;

import org.springframework.beans.factory.annotation.Autowired;


public class Chinese implements IHuman
{
    private Tool tool;

    public Chinese (Tool tool)
    {
        this.tool = tool;
    }

    @Override
    public void eatUseTool ()
    {
        this.tool.getToolName();
    }
}
