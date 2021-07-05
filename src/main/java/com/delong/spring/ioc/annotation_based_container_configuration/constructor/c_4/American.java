package com.delong.spring.ioc.annotation_based_container_configuration.constructor.c_4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component("american")
public class American implements IHuman
{
    private Tool tool;

    @Autowired
    public American (@Qualifier("knifeAndPork") Tool tool)
    {
        this.tool = tool;
    }

    @Override
    public void eatUseTool ()
    {
        this.tool.getToolName();
    }
}
