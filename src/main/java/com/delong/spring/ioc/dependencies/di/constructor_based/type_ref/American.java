package com.delong.spring.ioc.dependencies.di.constructor_based.type_ref;

public class American implements IHuman
{
    private Tool tool;
    public American (Tool tool)
    {
        this.tool = tool;
    }

    @Override
    public void eatTools ()
    {
       this.tool.toolName();
    }
}
