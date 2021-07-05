package com.delong.spring.ioc.annotation_based_container_configuration.setter.s5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("american")
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
