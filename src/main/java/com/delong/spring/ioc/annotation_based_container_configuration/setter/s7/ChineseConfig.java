package com.delong.spring.ioc.annotation_based_container_configuration.setter.s7;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {Chopsticks.class, Chinese.class})
public class ChineseConfig
{
}
