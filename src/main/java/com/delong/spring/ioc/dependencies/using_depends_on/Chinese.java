package com.delong.spring.ioc.dependencies.using_depends_on;

public class Chinese implements IHuman
{
    @Override
    public void useTool()
    {
        Chopsticks.toolName();
    }
}
