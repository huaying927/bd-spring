package com.delong.base.proxy.dynamic_proxy;

//抽取出类似于AOP中Aspect
public class AspectClass
{
    public void before()
    {
        System.out.println("租房子之前配全新家电");
    }

    public void after()
    {
        System.out.println("交完租金之后给你介绍隔壁屋的小美女");
    }
}
