package com.delong.spring.ioc.dependencies.dependencies_and_configuration_in_detail.collections.collection_merge;

import com.delong.spring.ioc.dependencies.dependencies_and_configuration_in_detail.collections.traditional_collections.TraditionalCollections;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDependenciesTest
{
    @Test
    public void testSpringDependenciesInjection ()
    {
        final ApplicationContext context =
                new ClassPathXmlApplicationContext("dependencies_and_configuration_in_detail.collections.collection_merge/applicationContext.xml");

        final SubCollection tc = context.getBean(SubCollection.class);

        tc.printList();
    }
}
