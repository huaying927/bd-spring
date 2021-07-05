package com.delong.spring.ioc.dependencies.di.constructor_based.name_value;

public class American implements IHuman
{
    private String name;
    private int age;
    public American (String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public void sayHello ()
    {
        System.out.println(this.name + "： hello, you are " + this.age + "old year");
    }
}
