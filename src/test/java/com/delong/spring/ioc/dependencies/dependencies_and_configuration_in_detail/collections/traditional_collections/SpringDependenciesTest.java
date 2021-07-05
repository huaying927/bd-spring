package com.delong.spring.ioc.dependencies.dependencies_and_configuration_in_detail.collections.traditional_collections;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDependenciesTest
{
    @Test
    public void testSpringDependenciesInjection ()
    {
        final ApplicationContext context =
                new ClassPathXmlApplicationContext("dependencies_and_configuration_in_detail.collections.traditional_collections/applicationContext.xml");

        final TraditionalCollections tc = context.getBean(TraditionalCollections.class);

        tc.printArray();

        tc.printList();

        tc.printSet();

        tc.printMap();

        tc.printProperties();
    }
}
