package com.delong.spring.ioc.bean_overview.instantiating_beans.instantiation_with_a_constructor;

public class Chinese implements IHuman
{
    public Chinese ()
    {
        System.out.println("chinese constructor");
    }

    @Override
    public void sayHello (String name)
    {
        System.out.println(name + ": 你好");
    }
}
