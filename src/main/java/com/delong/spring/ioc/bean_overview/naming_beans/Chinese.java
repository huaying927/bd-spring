package com.delong.spring.ioc.bean_overview.naming_beans;

public class Chinese implements IHuman
{
    @Override
    public void sayHello (String name)
    {
        System.out.println(name + ": 你好");
    }
}
