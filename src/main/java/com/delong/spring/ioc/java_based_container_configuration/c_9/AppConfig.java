package com.delong.spring.ioc.java_based_container_configuration.c_9;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig
{
    @Bean
    public IHuman chinese()
    {
        return new Chinese(chopsticks());
    }

    @Bean
    public IHuman american()
    {
        return new American(knifeAndPork());
    }

    @Bean
    public Tool chopsticks()
    {
        return new Chopsticks("筷子");
    }

    @Bean
    public Tool knifeAndPork()
    {
        return new KnifeAndPork("knife and pork");
    }
}
