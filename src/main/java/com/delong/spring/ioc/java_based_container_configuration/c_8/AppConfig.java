package com.delong.spring.ioc.java_based_container_configuration.c_8;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig
{
    @Bean
    public IHuman chinese()
    {
        return new Chinese();
    }

    @Bean
    public IHuman american()
    {
        return new American();
    }

    @Bean
    public Tool chopsticks()
    {
        return new Chopsticks();
    }

    @Bean
    public Tool knifeAndPork()
    {
        return new KnifeAndPork();
    }
}
