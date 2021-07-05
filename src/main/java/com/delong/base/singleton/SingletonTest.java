package com.delong.base.singleton;

public class SingletonTest
{
    public static void main (String[] args)
    {
        final Singleton si = Singleton.getSingletonInstance();
        final Singleton si2 = Singleton.getSingletonInstance();

        System.out.println(si == si2);
    }
}
