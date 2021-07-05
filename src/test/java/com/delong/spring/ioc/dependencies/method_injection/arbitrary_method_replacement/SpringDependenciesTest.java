package com.delong.spring.ioc.dependencies.method_injection.arbitrary_method_replacement;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDependenciesTest
{
    @Test
    public void testSpringDependenciesInjection ()
    {
        final ApplicationContext context =
                new ClassPathXmlApplicationContext("dependencies.method_injection.arbitrary_method_replacement/applicationContext.xml");

        final Chinese chinese = context.getBean(Chinese.class);

        chinese.work();
    }
}
