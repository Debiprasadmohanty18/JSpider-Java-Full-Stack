package com.JSP.Interface;

interface I12 {
	void m1();
	void m1(int i);
}
interface I23 extends I12{
	void m1(int i);
	void m2();
}
class X {
	public void m2()
	{
		System.out.println("M2()-X");
	}
}
class Z extends X implements I23 {

	@Override
	public void m1(int i) 
	{
		System.out.println("M1(int i)-Z");		
	}

	@Override
	public void m1() 
	{
		System.out.println("M1()-Z");	
	}
	
}

public class Example3 {

	public static void main(String[] args) {
		
		I12 ob1 = new Z();
		ob1.m1();
		ob1.m1(100);
//		ob1.m2(); --> CTE
		
		I23 ob2 = new Z();
		ob2.m1();
		ob2.m2();
		ob2.m1(200);
	}

}
