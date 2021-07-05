package com.delong.spring.ioc.annotation_based_container_configuration.constructor.c_1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringDependenciesTest
{
    @Test
    public void testSpringDependenciesInjection ()
    {
        final ApplicationContext context =
                new ClassPathXmlApplicationContext("annotation_based_container_configuration.constructor.c_1/applicationContext.xml");

        final Chinese chinese = context.getBean(Chinese.class);

        chinese.eatTool();
    }
}
