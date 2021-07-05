package com.delong.spring.ioc.dependencies.di.constructor_based.type_value;

public class Chinese implements IHuman
{
    private String name;

    private int age;

    public Chinese (String name, int age)
    {
       this.name = name;
       this.age = age;
    }

    @Override
    public void sayHello ()
    {
        System.out.println(this.name + ": 你好, 你已经 " + this.age + "了");
    }
}
