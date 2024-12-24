package com.JSP.AbstractKeyword;

abstract class AA {
	abstract void m1();
	abstract void m2();
}
abstract class BB extends AA {

	@Override
	void m1() {
		System.out.println("M1()-BB");
	}

	abstract void m3();
}
class CC extends BB {

	@Override
	void m3() {
		System.out.println("M3()-CC");
	}

	@Override
	void m2() {
		System.out.println("M2()-CC");
	}	
	
}

public class Example2 {

	public static void main(String[] args) {
		
//		AA a = new AA(); --> CTE
//		AA a = new BB(); --> CTE
		AA a1 = new CC();
		a1.m1(); // M1()-BB
		a1.m2(); // M2()-CC
//		a1.m3(); --> CTE
		
		CC c1 = (CC) a1;
		c1.m3(); // M3()-CC

	}

}
