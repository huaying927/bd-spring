package com.delong.spring.ioc.java_based_container_configuration.c_7;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SpringDependenciesTest
{
    @Test
    public void testSpringDependenciesInjection ()
    {
        final ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        IHuman chinese = (IHuman) context.getBean("chinese");

        chinese.eatUseTool();

    }
}
