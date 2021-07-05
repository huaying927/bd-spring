package com.delong.spring.ioc.dependencies.using_depends_on;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDependenciesTest
{
    @Test
    public void testSpringDependenciesInjection ()
    {
        final ApplicationContext context =
                new ClassPathXmlApplicationContext("dependencies.using_depends_on/applicationContext.xml");

        final Chinese chinese = context.getBean(Chinese.class);

        chinese.useTool();
    }
}
