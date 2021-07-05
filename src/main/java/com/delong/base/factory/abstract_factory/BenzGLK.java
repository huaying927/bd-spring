package com.delong.base.factory.abstract_factory;

// 具体产品角色
public class BenzGLK extends Benz
{

	@Override
	public void createBenz()
	{
		System.out.println("制造奔驰GLK");
	}

	
}
