package com.delong.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//@Aspect
//@Component
public class BuyAspect
{

    @Before("execution(* com.delong.spring.aop.IBuy.buy(..))")
    public void haha ()
    {
        System.out.println("男孩女孩都买自己喜欢的东西");
    }

    @After("execution(* com.delong.spring.aop.Girl.buy(..))")
    public void haha2 ()
    {
        System.out.println("女孩都买自己喜欢的东西");
    }

    //        @AfterReturning("execution(* com.delong.spring.aop.Girl.buy(..))")
    //        public void haha3(){
    //            System.out.println("女孩都买自己喜欢的东西");
    //        }

    //        @AfterThrowing("execution(* com.delong.spring.aop.Girl.buy(..))")
    //        public void haha3(){
    //            System.out.println("女孩都买自己喜欢的东西");
    //        }

    //    @Around("execution(* com.delong.spring.aop.IBuy.buy(..))&&bean(girl)&&within(com.delong.spring.aop.*)")
    //    @Around("execution(* com.delong.spring.aop.IBuy.buy(..))")
    //    public void haha4 (ProceedingJoinPoint pj)
    //    {
    //        System.out.println("before around...");
    //
    //        try
    //        {
    //            pj.proceed();
    //        }
    //        catch (Throwable throwable)
    //        {
    //            throwable.printStackTrace();
    //        }
    //
    //        System.out.println("after around...");
    //    }
}
