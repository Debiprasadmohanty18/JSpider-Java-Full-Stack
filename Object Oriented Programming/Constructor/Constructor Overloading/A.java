package com.JSP.ConstructorOverloading;

public class A {
	A()
	{
		System.out.println("A() Constructor");
	}
	
	A(int i)
	{
		System.out.println("A(int i) Constructor");
	}
	
	A(int i, int j)
	{
		System.out.println("A(int i, int j) Constructor");
	}
	public static void main(String[] args) {
		
		new A();
		new A(10);
		new A(10, 20);
//		new A(10, 20, 30, 40); --- CTE

	}

}
