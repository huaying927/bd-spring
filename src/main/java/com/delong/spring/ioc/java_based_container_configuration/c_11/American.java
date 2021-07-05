package com.delong.spring.ioc.java_based_container_configuration.c_11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class American implements IHuman
{
    private Tool tool;

    @Autowired
    @Qualifier("knifeAndPork")
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
