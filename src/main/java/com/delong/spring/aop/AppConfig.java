package com.delong.spring.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.delong.spring.aop")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AppConfig
{
}
