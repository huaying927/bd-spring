package com.delong.spring.ioc.dependencies.autowiring_collaborators.by_name;

public class Chinese implements IHuman
{
    private Tools chopsticks;

    public void setChopsticks(Chopsticks tool)
    {
        this.chopsticks = tool;
    }

    @Override
    public void useTool()
    {
        this.chopsticks.toolName();
    }
}
