package com.delong.spring.ioc.java_based_container_configuration.c_10;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({AppChineseConfig.class, AppAmericanConfig.class})
public class AppConfig
{

}
