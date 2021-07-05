package com.delong.base.proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxyTest
{
    public static void main (String[] args)
    {
        InvocationHandler handler = (InvocationHandler) new DynamicProxySubject(new RealSubject());

        try
        {
            Subject subject =
                    (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(), new Class[]{Subject.class}, handler);

            subject.hiredHouse();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
