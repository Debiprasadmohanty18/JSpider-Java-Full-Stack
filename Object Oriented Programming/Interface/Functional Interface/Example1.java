package com.JSP.Interface.FunctionalInterface;

@FunctionalInterface
interface I1 {
	void m1();
	
	default void m2()
	{
		System.out.println("M2()-I1");
	}
	
	static void m3()
	{
		System.out.println("M3()-I1");
	}
}
class A implements I1 {
	@Override
	public void m1()
	{
		System.out.println("M1()-A");
	}
}

public class Example1 {

	public static void main(String[] args) 
	{
		I1.m3(); // M3()-I1
		I1 ob1 = new A();
		ob1.m1(); // M1()-A
		ob1.m2(); // M2()-I1
	}

}
