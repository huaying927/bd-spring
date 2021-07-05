package com.delong.spring.ioc.dependencies.lazy_initialized_beans;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDependenciesTest
{
    @Test
    public void testSpringDependenciesInjection ()
    {
        final ApplicationContext context =
                new ClassPathXmlApplicationContext("dependencies.lazy_initialized_beans/applicationContext.xml");

        final Chinese ch = context.getBean(Chinese.class);
    }
}
