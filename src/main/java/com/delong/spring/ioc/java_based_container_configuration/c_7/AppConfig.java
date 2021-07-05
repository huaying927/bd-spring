package com.delong.spring.ioc.java_based_container_configuration.c_7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <bean id="abc" class="Chinese"/>
 */

@Configuration
public class AppConfig
{
//    @Bean//方法的名字默认就是id的值
    @Bean({"abc", "chinese", "china"})
    public IHuman chinese()
    {
        return new Chinese(chopsticks());
    }

    @Bean
    public Tool chopsticks()
    {
        return new Chopsticks("一双筷子");
    }
}
