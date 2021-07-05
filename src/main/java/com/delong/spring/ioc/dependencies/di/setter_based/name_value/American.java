package com.delong.spring.ioc.dependencies.di.setter_based.name_value;

public class American implements IHuman
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
        System.out.println(this.name + "： hello, you are " + this.age + "old year");
    }
}
