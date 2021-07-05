package com.delong.spring.ioc.bean_overview.naming_beans;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIocTest
{
    @Test
    public void testSpringIoc()
    {
        final ApplicationContext
                context = new ClassPathXmlApplicationContext("ioc.bean_overview.naming_beans/applicationContext.xml");

        final Chinese chinese = context.getBean(Chinese.class);

        chinese.sayHello("zhangsan");

        final IHuman american = (IHuman)context.getBean("zkg");

        american.sayHello("Red Johnson");
    }
}
