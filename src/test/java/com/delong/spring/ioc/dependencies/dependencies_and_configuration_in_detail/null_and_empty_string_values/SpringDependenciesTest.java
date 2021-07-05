package com.delong.spring.ioc.dependencies.dependencies_and_configuration_in_detail.null_and_empty_string_values;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDependenciesTest
{
    @Test
    public void testSpringDependenciesInjection ()
    {
        final ApplicationContext context =
                new ClassPathXmlApplicationContext("dependencies_and_configuration_in_detail.null_and_empty_string_values/applicationContext.xml");

        IHuman chinese = (IHuman) context.getBean("chinese");

        chinese.sayHello();

        IHuman american = (IHuman) context.getBean("american");

        american.sayHello();

    }
}
