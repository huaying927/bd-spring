package com.delong.spring.ioc.annotation_based_container_configuration.setter.s7;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ChineseConfig.class, AmericanConfig.class})
public class AppConfig
{
}
