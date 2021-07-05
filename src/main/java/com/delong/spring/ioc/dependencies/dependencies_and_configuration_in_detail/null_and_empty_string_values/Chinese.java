package com.delong.spring.ioc.dependencies.dependencies_and_configuration_in_detail.null_and_empty_string_values;

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
