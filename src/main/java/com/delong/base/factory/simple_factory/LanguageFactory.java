package com.delong.base.factory.simple_factory;

/**
 * 简单工厂(静态工厂)：一个工厂只能生产一种产品
 */
public class LanguageFactory
{
    public static IHuman getLanguage (String language)
    {
        if ("chinese".equalsIgnoreCase(language))
        {
            return new Chinese();
        }
        else
        {
            return new American();
        }

    }
}
