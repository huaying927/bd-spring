package com.delong.spring.ioc.dependencies.autowiring_collaborators.constructor;

public class American implements IHuman
{
    private Tools tool;

    public American(KnifeAndPork tool)
    {
        this.tool = tool;
    }

    @Override
    public void useTool()
    {
        this.tool.toolName();
    }
}
