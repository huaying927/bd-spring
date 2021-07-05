package com.delong.spring.ioc.java_based_container_configuration.c_4;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;


public class Chinese implements IHuman
{
    private String name;

    public Chinese (String name)
    {
        this.name = name;
    }

    @Override
    public void eatTool ()
    {
        System.out.println(this.name + "吃饭用筷子");
    }
}
