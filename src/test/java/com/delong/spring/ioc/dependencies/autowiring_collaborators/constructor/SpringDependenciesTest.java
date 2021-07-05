package com.delong.spring.ioc.dependencies.autowiring_collaborators.constructor;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDependenciesTest
{
    @Test
    public void testSpringDependenciesInjection ()
    {
        final ApplicationContext context =
                new ClassPathXmlApplicationContext("dependencies.autowiring_collaborators.constructor/applicationContext.xml");

        final Chinese chinese = context.getBean(Chinese.class);

        chinese.useTool();

        final American american = context.getBean(American.class);

        american.useTool();
    }
}
