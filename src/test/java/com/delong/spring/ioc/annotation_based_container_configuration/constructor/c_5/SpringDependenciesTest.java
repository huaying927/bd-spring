package com.delong.spring.ioc.annotation_based_container_configuration.constructor.c_5;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 使用AnnotationApplicationContext可以用一个标注了
 * Configuration和ComponentScan的注解的类来代替配置文件
 */
public class SpringDependenciesTest
{
    @Test
    public void testSpringDependenciesInjection ()
    {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        final IHuman chinese = (IHuman) context.getBean("chinese");

        chinese.eatUseTool();

        IHuman american = (IHuman) context.getBean("american");

        american.eatUseTool();

    }
}
