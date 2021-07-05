package com.delong.spring.ioc.dependencies.dependencies_and_configuration_in_detail.compound_property_names;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDependenciesTest
{
    @Test
    public void testSpringDependenciesInjection ()
    {
        final ApplicationContext context =
                new ClassPathXmlApplicationContext("dependencies_and_configuration_in_detail.compound_property_names/applicationContext.xml");

        final Employee employee = context.getBean(Employee.class);

        employee.printWorkInfo();
    }
}
