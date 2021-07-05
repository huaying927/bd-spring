package com.delong.spring.ioc.dependencies.di.setter_based.name_value;

public class Chinese implements IHuman
{
    private String name;

    private int age;

    public void setName (String name)
    {
        this.name = name;
    }

    public void setAge (int age)
    {
        this.age = age;
    }

    @Override
    public void sayHello ()
    {
        System.out.println(this.name + ": 你好, 你已经 " + this.age + "了");
    }
}
