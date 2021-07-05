package com.delong.spring.ioc.bean_overview.naming_beans;

public class American implements IHuman
{
    @Override
    public void sayHello (String name)
    {
        System.out.println(name + "： hello");
    }
}
