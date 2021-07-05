package com.delong.spring.ioc.java_based_container_configuration.c_5;


public class American implements IHuman
{
    private String name;

    public American (String name)
    {
        this.name = name;
    }

    @Override
    public void eatTool ()
    {
        System.out.println(this.name + "吃饭用刀和叉");
    }
}
