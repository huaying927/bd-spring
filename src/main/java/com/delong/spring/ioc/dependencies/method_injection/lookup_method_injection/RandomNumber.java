package com.delong.spring.ioc.dependencies.method_injection.lookup_method_injection;


public class RandomNumber
{
	private int num = (int) (100 * Math.random());

	public void printRandom()
	{
		System.out.println("随机数是" + num);
	}
}
