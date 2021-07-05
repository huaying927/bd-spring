package com.delong.spring.ioc.dependencies.method_injection.arbitrary_method_replacement;

public class ConcreteTool implements Tool
{
	@Override
	public void realWork()
	{
       System.out.println("真正工作的工具。。。。");
	}

}
