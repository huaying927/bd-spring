package com.delong.spring.ioc.annotation_based_container_configuration.constructor.c_3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <bean id="chopsticks" class="c3.Chopsticks">
 *     <constructor-args type="java.lang.String" value="筷子"/>
 * </bean>
 *
 * <bean id="chinese" class="c3.Chinese" autowire="byType"/>
 */

@Component("chinese")
public class Chinese implements IHuman
{
    private Tool tool;

    @Autowired
    public Chinese (Tool tool)
    {
        this.tool = tool;
    }

    @Override
    public void eatUseTool ()
    {
        this.tool.getToolName();
    }
}
