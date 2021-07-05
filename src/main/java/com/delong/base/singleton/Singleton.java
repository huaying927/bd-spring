package com.delong.base.singleton;


/**
 * 单例设计模式：一个类只能产生一个对象
 * 单例模式要满足四个要素：
 * 1.构造方法私有
 * 2.有一个私有的、静态的、被final修饰的实例
 * 3.有一个返回该单例的公有的、静态的方法
 * 4.被final修饰的类(不必要)
 *
 * Spring中的单例和单例模式区别：
 * Spring中的单例指的是一个类在同一个IOC容器中只能产生一个实例
 * 单例设计模式中的单例指的是在同一个JVM中只能产生一个实例
 */
public final class Singleton
{
    private static final Singleton SINGLETON_INSTANCE = new Singleton();

    private Singleton ()
    {

    }

    public static Singleton getSingletonInstance()
    {
        return SINGLETON_INSTANCE;
    }
}
