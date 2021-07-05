package com.delong.spring.ioc.container_overview.useing_the_container;

import com.delong.spring.ioc.container_overview.using_the_container.American;
import com.delong.spring.ioc.container_overview.using_the_container.Chinese;
import com.delong.spring.ioc.container_overview.using_the_container.IHuman;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIocTest
{
    @Test
    public void testSpringIoc()
    {
        final ClassPathXmlApplicationContext
                context = new ClassPathXmlApplicationContext("ioc.use_the_container/applicationContext.xml");

        final Chinese chinese = context.getBean(Chinese.class);

        chinese.sayHello("zhangsan");

        final boolean flag = context.isSingleton("chinese");

        System.out.println("flag = " + flag);

        final American american = context.getBean("american", American.class);

        american.sayHello("Red Johnson");
    }
}
