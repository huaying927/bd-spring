package com.delong.spring.ioc.dependencies.di.constructor_based.type_value;

import com.delong.spring.ioc.container_overview.using_the_container.American;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDependenciesTest
{
    @Test
    public void testSpringDependenciesInjection()
    {
        final ApplicationContext
                context = new ClassPathXmlApplicationContext("di.constructor_based.type_value/applicationContext.xml");

        IHuman chinese = (IHuman) context.getBean("chinese");

        chinese.sayHello();

        IHuman american = (IHuman) context.getBean("american");

        american.sayHello();

    }
}
