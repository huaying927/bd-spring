package com.delong.spring.ioc.dependencies.di.setter_based.name_ref;

public class Chinese implements IHuman
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
