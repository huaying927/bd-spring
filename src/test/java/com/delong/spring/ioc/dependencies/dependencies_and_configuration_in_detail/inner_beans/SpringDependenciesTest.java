package com.delong.spring.ioc.dependencies.dependencies_and_configuration_in_detail.inner_beans;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDependenciesTest
{
    @Test
    public void testSpringDependenciesInjection ()
    {
        final ApplicationContext context =
                new ClassPathXmlApplicationContext("dependencies_and_configuration_in_detail.inner_beans/applicationContext.xml");

        IHuman chinese = (IHuman) context.getBean("chinese");

        chinese.eatTools();

        IHuman american = (IHuman) context.getBean("american");

        american.eatTools();

    }
}
