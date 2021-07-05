package com.delong.spring.ioc.dependencies.di.setter_based.name_value;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDependenciesTest
{
    @Test
    public void testSpringDependenciesInjection ()
    {
        final ApplicationContext context =
                new ClassPathXmlApplicationContext("di.setter_based.name_value/applicationContext.xml");

        IHuman chinese = (IHuman) context.getBean("chinese");

        chinese.sayHello();

        IHuman american = (IHuman) context.getBean("american");

        american.sayHello();

    }
}
