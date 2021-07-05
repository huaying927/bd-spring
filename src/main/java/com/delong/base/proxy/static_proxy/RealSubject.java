package com.delong.base.proxy.static_proxy;

//真实主题角色
public class RealSubject extends Subject
{
    @Override
    public void hiredHouse ()
    {
        System.out.println("出租房子成功");
    }
}
