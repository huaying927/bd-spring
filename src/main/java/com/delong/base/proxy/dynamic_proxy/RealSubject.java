package com.delong.base.proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;

//真实主题角色
public class RealSubject implements Subject
{
    @Override
    public void hiredHouse ()
    {
        System.out.println("出租房子成功");
    }
}
