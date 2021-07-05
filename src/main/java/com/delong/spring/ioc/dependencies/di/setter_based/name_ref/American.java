package com.delong.spring.ioc.dependencies.di.setter_based.name_ref;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

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
