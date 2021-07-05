package com.delong.spring.ioc.java_based_container_configuration.c_4;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SpringDependenciesTest
{
    @Test
    public void testSpringDependenciesInjection ()
    {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        IHuman chinese = (IHuman) context.getBean("chinese");

        chinese.eatTool();
    }
}
