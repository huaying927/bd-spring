package com.delong.spring.ioc.java_based_container_configuration.c_5;

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

        IHuman american = (IHuman) context.getBean("american");

        american.eatTool();
    }
}
