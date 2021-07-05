package com.delong.spring.ioc.java_based_container_configuration.c_10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppAmericanConfig
{
    @Bean
    public IHuman american()
    {
        return new American();
    }


    @Bean
    public Tool knifeAndPork()
    {
        return new KnifeAndPork();
    }

}
