package com.Oops.Interface;

interface I6 {
	static void m1()
	{
		System.out.println("static M1()-I6");
	}
	void m2();
	default void m3()
	{
		System.out.println("default M3()-I6");
	}
	private void m4()
	{
		System.out.println("private M4()-I6");
		m4();
	}
}
class Q implements I6 {

	@Override
	public void m2() {
		System.out.println("M2()-Q");		
	}
	
}

public class JDK8interfaceEx2 {

	public static void main(String[] args) {
		
		I6 i1 = new Q();
//		i1.m1(); --> CTE
		I6.m1();
		i1.m2();
		i1.m3();
//		i1.m4(); --> CTE
		
	}
}
