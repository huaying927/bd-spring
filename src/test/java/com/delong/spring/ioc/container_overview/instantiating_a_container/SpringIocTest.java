package com.delong.spring.ioc.container_overview.instantiating_a_container;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIocTest
{
    @Test
    public void testSpringIoc()
    {
        final ApplicationContext
                context = new ClassPathXmlApplicationContext("ioc/container_overview/applicationContext.xml");

        IHuman chinese = (IHuman) context.getBean("chinese");

//        IHuman chinese2 = (IHuman) context.getBean("chinese");
//
//        System.out.println(chinese == chinese2);

        chinese.sayHello("张三");

        IHuman american = (IHuman) context.getBean("american");

        american.sayHello("Red Johnson");
    }
}
