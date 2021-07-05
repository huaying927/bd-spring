package com.delong.spring.ioc.java_based_container_configuration.c_11;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

import java.util.Hashtable;
import java.util.Properties;

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
