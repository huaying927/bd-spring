package com.delong.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAopTest
{
    public static void main (String[] args)
    {
        final AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        final Boy boy = ctx.getBean("boy", Boy.class);

//        boy.buy();
        final String buy = boy.buy();
        System.out.println("buy = " + buy);


        final Girl girl = ctx.getBean(Girl.class);
        girl.buy();
//       final String buy1 = girl.buy();
//        System.out.println("buy1 = " + buy1);
    }
}
