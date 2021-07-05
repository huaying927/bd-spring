package com.delong.spring.ioc.java_based_container_configuration.c_2;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SpringDependenciesTest
{
    @Test
    public void testSpringDependenciesInjection ()
    {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//        context.scan("com.delong.spring.ioc.java_based_container_configuration.c_2");
//        context.refresh();

//        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//        context.register(AppConfig.class);
//        context.refresh();

        IHuman chinese = (IHuman) context.getBean("chinese");

        chinese.eatTool();
    }
}
