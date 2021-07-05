package com.delong.spring.ioc.dependencies.lazy_initialized_beans;

public class Chinese implements IHuman
{
    public Chinese ()
    {
        System.out.println("chinese default constructor");
    }
}
