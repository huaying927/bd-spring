package com.delong.spring.ioc.container_overview.using_the_container;

public class Chinese implements IHuman
{
    @Override
    public void sayHello (String name)
    {
        System.out.println(name + ": 你好");
    }
}
