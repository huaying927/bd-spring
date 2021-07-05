package com.delong.spring.ioc.java_based_container_configuration.c_2;

import com.delong.spring.ioc.annotation_based_container_configuration.setter.s7.Chopsticks;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig
{
    @Bean
    public Chinese chinese()
    {

//        final Chinese chinese = new Chinese("中国人");

        return new Chinese("中国人");
    }
}
