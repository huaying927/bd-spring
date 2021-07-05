package com.delong.base.proxy.static_proxy;

public class StaticProxyTest
{
    public static void main (String[] args)
    {
        Subject subject = (Subject) new StaticProxySubject();

        subject.hiredHouse();
    }
}
