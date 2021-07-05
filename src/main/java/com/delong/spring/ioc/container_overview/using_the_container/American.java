package com.delong.spring.ioc.container_overview.using_the_container;

public class American implements IHuman
{
    @Override
    public void sayHello (String name)
    {
        System.out.println(name + "： hello");
    }
}
