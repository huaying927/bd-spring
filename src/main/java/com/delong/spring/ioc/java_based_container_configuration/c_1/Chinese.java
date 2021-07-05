package com.delong.spring.ioc.java_based_container_configuration.c_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * <bean id="chinese" class="Chinese">
 *    <property name="name" value="中国人"/>
 * </bean>
 */
public class Chinese implements IHuman
{
    private String name;

    public void setName (String name)
    {
        this.name = name;
    }

    @Override
    public void eatTool ()
    {
        System.out.println(this.name + "吃饭用筷子-----");
    }
}
