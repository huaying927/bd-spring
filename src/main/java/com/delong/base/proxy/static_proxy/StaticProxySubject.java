package com.delong.base.proxy.static_proxy;

//代理主题角色：
public class StaticProxySubject extends Subject
{
    private RealSubject realSubject;

    private AspectClass aspectClass;

    public StaticProxySubject ()
    {
    }

    public StaticProxySubject (RealSubject realSubject)
    {
        this.realSubject = realSubject;
    }

    @Override
    public void hiredHouse ()
    {
        if (this.aspectClass == null)
        {
            this.aspectClass = new AspectClass();
        }

        this.aspectClass.before();//相当于AOP中前置通知

        if (this.realSubject == null)
        {
            this.realSubject = new RealSubject();
        }

        this.realSubject.hiredHouse();

        this.aspectClass.after();//相当于AOP中后置通知



    }


}
