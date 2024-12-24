package com.JSP.AbstractKeyword;

abstract class X {
	int i = 10;
	int j = 20;
	
	public void m1()
	{
		System.out.println("M1()-X");
	}
	abstract void m2();
	
	X()
	{
		System.out.println("X()-Cons...");
	}
	
}
class Y extends X {

	int i = 30;
	int j = 40;
	
	@Override
	void m2() 
	{
		System.out.println("M2()-Y");
	}
	
	Y()
	{
		System.out.println("Y()-Cons...");
	}
	
}

public class Example3 {

	public static void main(String[] args) {
		
		X x1 = new Y(); // X()-Cons... Y()-Cons...
		System.out.println("i = " + x1.i + ", j = " + x1.j); // 10 20
		x1.m1(); // M1()-X
		x1.m2(); // M1()-Y

	}

}
