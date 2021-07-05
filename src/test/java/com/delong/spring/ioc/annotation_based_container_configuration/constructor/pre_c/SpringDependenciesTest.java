package com.delong.spring.ioc.annotation_based_container_configuration.constructor.pre_c;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class SpringDependenciesTest
{
    @Test
    public void testSpringDependenciesInjection ()
    {
        final ApplicationContext context =
                new ClassPathXmlApplicationContext("annotation_based_container_configuration.constructor.pre_c/applicationContext.xml");

        final Chinese chinese = context.getBean(Chinese.class);

        chinese.eatTool();

        final American american = context.getBean(American.class);

        american.eatTool();
    }
}
