package com.delong.spring.ioc.annotation_based_container_configuration.setter.s4;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringDependenciesTest
{
    @Test
    public void testSpringDependenciesInjection ()
    {
        final ApplicationContext context =
                new ClassPathXmlApplicationContext("annotation_based_container_configuration.setter.s4/applicationContext.xml");

        IHuman chinese = (IHuman) context.getBean("chinese");

        chinese.eatUseTool();
    }
}
