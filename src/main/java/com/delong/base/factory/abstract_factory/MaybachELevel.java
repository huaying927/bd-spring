package com.delong.base.factory.abstract_factory;

// 具体产品角色
public class MaybachELevel extends Maybach
{

	@Override
	public void createMaybach()
	{
		System.out.println("制造迈巴赫E级");
	}
    
}
