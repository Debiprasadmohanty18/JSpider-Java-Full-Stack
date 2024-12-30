package com.JSP.Interface;

interface I11 {
	void m1();
	void m2();
}
interface I22 {
	void m1();
	void m3();
}
class C implements I11,I22 {

	@Override
	public void m3() 
	{
		System.out.println("M3()-C");
	}

	@Override
	public void m1() 
	{
		System.out.println("M1()-C");
	}

	@Override
	public void m2() 
	{
		System.out.println("M2()-C");
	}
	
}
public class Example2 {

	public static void main(String[] args) 
	{
		I11 ob1 = new C();
		ob1.m1();
		ob1.m2();
//		ob1.m3(); --> CTE
		System.out.println("=======");
		I22 ob2 = new C();
		ob2.m1();
		ob2.m3();
//		ob2.m2(); --> CTE
	}

}
