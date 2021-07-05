package com.delong.base.factory.simple_factory;

public class SimpleFactoryTest
{
    public static void main (String[] args)
    {
        final IHuman iHuman = LanguageFactory.getLanguage("american");

        iHuman.speakLanguage();
    }
}
