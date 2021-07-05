package com.delong.base.factory.factory_method;

//具体工厂类
public class BenzGLKFactory extends BenzFactory
{

	@Override
	public Benz createBenz()
	{
		return new BenzGLK();
	}
	
}
