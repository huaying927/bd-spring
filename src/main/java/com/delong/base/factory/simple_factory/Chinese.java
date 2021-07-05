package com.delong.base.factory.simple_factory;

public class Chinese implements IHuman
{
    @Override
    public void speakLanguage ()
    {
        System.out.println("中国人说中文");
    }
}
