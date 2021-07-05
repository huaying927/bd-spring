package com.delong.spring.ioc.java_based_container_configuration.c_8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Chinese implements IHuman
{
    private Tool tool;

    @Autowired
    @Qualifier("chopsticks")
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
