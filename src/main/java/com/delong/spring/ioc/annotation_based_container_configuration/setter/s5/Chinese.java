package com.delong.spring.ioc.annotation_based_container_configuration.setter.s5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("chinese")
public class Chinese implements IHuman
{
    private Tool tool;

    @Autowired
    @Qualifier("chops")
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
