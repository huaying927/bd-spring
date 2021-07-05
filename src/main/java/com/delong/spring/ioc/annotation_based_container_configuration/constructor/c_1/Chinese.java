package com.delong.spring.ioc.annotation_based_container_configuration.constructor.c_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * <bean id="chinese" class="c_1.Chinese">
 *     <constructor-arg type="java.lang.String" value="筷子1双"/>
 * </bean>
 */
@Component("chinese")
public class Chinese implements IHuman
{
    private String toolName;

    @Autowired
    public Chinese (@Value("筷子1双") String toolName)
    {
        this.toolName = toolName;
    }

    @Override
    public void eatTool ()
    {
        System.out.println("中国人吃饭用的工具是" + this.toolName);

    }
}
