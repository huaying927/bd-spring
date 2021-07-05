package com.delong.spring.ioc.container_overview.instantiating_a_container;

public class American implements IHuman
{
    @Override
    public void sayHello (String name)
    {
        System.out.println(name + "： hello");
    }
}
