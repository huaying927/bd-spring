package com.delong.spring.ioc.bean_overview.instantiating_beans.instantiation_with_a_static_factory_method;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIocTest
{
    @Test
    public void testSpringIoc()
    {
        final ApplicationContext
                context = new ClassPathXmlApplicationContext("ioc.bean_overview.instantiating_beans.instantiation_with_a_static_factory_method/applicationContext.xml");
    }
}
