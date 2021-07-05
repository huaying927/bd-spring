package com.delong.spring.ioc.dependencies.method_injection.lookup_method_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDependenciesTest
{
	public static void main(String[] args)
	{
		try
		{
			ApplicationContext context = new ClassPathXmlApplicationContext(
					"dependencies.method_injection.lookup_method_injection/applicationContext.xml");
			
			AbstractRandomNumber abstractRandomNumber = (AbstractRandomNumber) context
					.getBean("abstractRandomNumber");
			
			System.out.println("下面两个实例没有采用方法注入");
			RandomNumber randomNumber = abstractRandomNumber.getRandomNumber();
			RandomNumber randomNumber2 = abstractRandomNumber.getRandomNumber();
			
			System.out.println("Random 的两个实例是否指向同一个引用："
					+ (randomNumber == randomNumber2));
			randomNumber.printRandom();
			randomNumber2.printRandom();
			System.out.println("---------------------------------");
			
			System.out.println("下面两个实例采用方法注入");
			RandomNumber randomNumber3 = abstractRandomNumber.createRandomNumber();
			RandomNumber randomNumber4 = abstractRandomNumber.createRandomNumber();

			System.out.println("Random 的两个实例是否指向同一个引用："
					+ (randomNumber3 == randomNumber4));

			randomNumber3.printRandom();
			randomNumber4.printRandom();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
