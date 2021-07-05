package com.delong.spring.ioc.annotation_based_container_configuration.constructor.pre_c;

import org.springframework.stereotype.Component;

//Component(组件):所有的Bean上加该注解相当于applicationContext.xml
//中的<bean id="" class="package_name.ClassName"/>
// spring中的Bean在不十分确定属于具体的业务或持久层是可以加该注解
@Component
public class American implements IHuman
{
    @Override
    public void eatTool ()
    {
        System.out.println("美国人吃饭用的工具是刀和叉");
        System.out.println("美国人吃饭用的工具是刀和叉2");
    }
}
