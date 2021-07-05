package com.delong.base.proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//代理主题角色：动态代理只能代理接口，不能代理类
public class DynamicProxySubject implements InvocationHandler
{
    private RealSubject realSubject;

    private AspectClass aspectClass;

    public DynamicProxySubject ()
    {
    }

    public DynamicProxySubject (RealSubject realSubject)
    {
        this.realSubject = realSubject;
    }

    @Override
    public Object invoke (Object proxy, Method method, Object[] args) throws Throwable
    {
        if (this.aspectClass == null)
        {
            this.aspectClass = new AspectClass();
        }
        this.aspectClass.before();

        if (this.realSubject == null)
        {
            this.realSubject = new RealSubject();
        }

        method.invoke(realSubject, args);

//        this.aspectClass.after();

        return null;
    }
}
