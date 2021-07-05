package com.delong.spring.ioc.bean_overview.instantiating_beans.instantiation_with_a_constructor;

public class American implements IHuman
{
    public American ()
    {
        System.out.println("american constructor");
    }

    @Override
    public void sayHello (String name)
    {
        System.out.println(name + "： hello");
    }
}
