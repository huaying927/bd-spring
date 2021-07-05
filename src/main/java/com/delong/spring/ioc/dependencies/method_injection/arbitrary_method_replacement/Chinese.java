package com.delong.spring.ioc.dependencies.method_injection.arbitrary_method_replacement;


import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class Chinese implements IHuman, MethodReplacer
{
	private Tool tool;

	public void setTool(Tool tool)
	{
		this.tool = tool;
	}


	public void work()
	{
		this.tool.realWork();
	}

	@Override
	public Object reimplement(Object obj, Method method, Object[] args)
			throws Throwable
	{
		System.out.println("替换方法");

		return null;
	}
}
