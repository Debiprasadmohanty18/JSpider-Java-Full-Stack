package com.JSP.AbstractKeyword;

abstract class A {
	abstract public void m1();
}
class B extends A {

	@Override
	public void m1() {
		System.out.println("M1()-B");
	}
	
}

public class Example1 {

	public static void main(String[] args) {
		
//		A a = new A(); --> CTE
		A a1 = new B();
		a1.m1(); // M1()-B

	}

}
