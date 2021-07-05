package com.delong.spring.ioc.annotation_based_container_configuration.setter.s2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * <bean id="chinese" class="c1.Chinese"/>
 *
 * <property name="name" value="bigdata"/>
 *
 * Component注解没有显示写value属性值，则属性值默认为小写的类名
 */
@Component
public class Chinese implements IHuman
{
    @Value("bigdata")
    private String name;


//    public void setName (String name)
//    {
//        this.name = name;
//    }

    @Override
    public void eatTool ()
    {
        System.out.println(this.name + "吃饭用筷子");
    }
}
