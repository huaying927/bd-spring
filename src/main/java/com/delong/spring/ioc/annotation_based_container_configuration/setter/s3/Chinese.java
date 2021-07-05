package com.delong.spring.ioc.annotation_based_container_configuration.setter.s3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <bean id="chopsticks" class="c3.Chopsticks">
 *     <property name="toolName" value="筷子"/>
 * </bean>
 *
 * <bean id="chinese" class="c3.Chinese" autowire="byType"/>
 */

@Component("chinese")
public class Chinese implements IHuman
{
    private Tool tool;

    @Autowired
    public void setTool (Tool tool)
    {
        this.tool = tool;
    }

    @Override
    public void eatUseTool ()
    {
        this.tool.getToolName();
    }
}
