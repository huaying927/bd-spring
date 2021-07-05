package com.delong.spring.ioc.dependencies.autowiring_collaborators.constructor;

public class Chinese implements IHuman
{
    private Tools tool;

    public Chinese(Chopsticks tool)
    {
        this.tool = tool;
    }

    @Override
    public void useTool()
    {
        this.tool.toolName();
    }
}
