package com.delong.base.factory.factory_method;

/**
 *  工厂方法：一抽象产品类派生出多个具体产品类；一抽象工厂类派生出多个具体工厂类；
 *  每个具体工厂类只能创建一个具体产品类的实例。
 *  即定义一个创建对象的接口（即抽象工厂类），让其子类（具体工厂类）决定实例化哪一个类
 * （具体产品类）。“一对一”的关系。
 *
 */
public class FactoryMethodTest
{
	public static void main(String[] args)
	{
		BenzFactory benz600Factory = new Benz600Factory();
		
		benz600Factory.createBenz();
		
//		BenzFactory benzGLKFactory = new BenzGLKFactory();
//
//		benzGLKFactory.createBenz();
	}
}
