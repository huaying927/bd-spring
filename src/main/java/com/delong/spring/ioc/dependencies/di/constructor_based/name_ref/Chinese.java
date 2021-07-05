package com.delong.spring.ioc.dependencies.di.constructor_based.name_ref;

public class Chinese implements IHuman
{
    private Tool tool;

    public Chinese (Tool tool)
    {
       this.tool = tool;
    }

    @Override
    public void eatTools ()
    {
        this.tool.toolName();
    }
}
