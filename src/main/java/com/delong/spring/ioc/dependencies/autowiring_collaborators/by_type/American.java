package com.delong.spring.ioc.dependencies.autowiring_collaborators.by_type;


public class American implements IHuman
{

    private KnifeAndPork knifeAndPork;

    public void setKnifeAndPork(KnifeAndPork knifeAndPork)
    {
        this.knifeAndPork = knifeAndPork;
    }

    @Override
    public void useTool()
    {
        this.knifeAndPork.toolName();
    }
}
