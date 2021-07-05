package com.delong.spring.ioc.java_based_container_configuration.c_11;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppChineseConfig
{
    @Bean
    public IHuman chinese()
    {
        return new Chinese();
    }

    @Bean
    public Tool chopsticks()
    {
        return new Chopsticks();
    }

}
