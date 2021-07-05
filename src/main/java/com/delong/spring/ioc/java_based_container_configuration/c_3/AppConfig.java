package com.delong.spring.ioc.java_based_container_configuration.c_3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig
{
    @Bean
    public Chinese chinese()
    {
        return new Chinese();
    }
}
