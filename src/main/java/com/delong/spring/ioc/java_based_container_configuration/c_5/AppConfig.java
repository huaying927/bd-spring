package com.delong.spring.ioc.java_based_container_configuration.c_5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig
{
    @Bean
    public IHuman chinese()
    {
        return new Chinese("中国共产党人");
    }

    @Bean
    public IHuman american()
    {
        return new American("美国人");
    }
}
