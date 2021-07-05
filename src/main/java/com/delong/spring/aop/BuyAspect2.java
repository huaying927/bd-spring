package com.delong.spring.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BuyAspect2
{
    @Pointcut("execution(* com.delong.spring.aop.IBuy.*(..))")
    public void test()
    {
//        final:
//        1.修饰方法不能被重写
//            2.修饰类的时候不能被继承
//            3.修饰成员变量时是常量
//               常量的赋值方式有：
//                <1>直接赋值
//                <2>构造赋值，每个构造方法都要赋值
    }

    @Before("test()")
    public void haha(){
        System.out.println("Big Data-男孩女孩都买自己喜欢的东西");
    }

    @After("test()")
    public void haha2(){
        System.out.println("女孩都买自己喜欢的东西");
    }

//    @AfterReturning("test()")
//    public void haha3(){
//        System.out.println("女孩都买自己喜欢的东西");
//    }

//    @AfterThrowing("test()")
//    public void haha3(){
//        System.out.println("女孩都买自己喜欢的东西");
//    }

//    @Around("test()")
//    public void haha4(ProceedingJoinPoint pj)
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
