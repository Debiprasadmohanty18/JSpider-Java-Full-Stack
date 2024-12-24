package com.JSP.Interface;

interface I1 {
	int i = 10; // public static final int i = 10;
	void m1(); // public abstract void m1();
}
class A implements I1 {

	@Override
	public void m1() {
		System.out.println("M1()-A");
	}
	
}

public class Example1 {

	public static void main(String[] args) {
//		I1 ob1 = new I1(); --> CTE
		I1 ob1 = new A();
		ob1.m1(); // M1()-A
//		System.out.println(I1.i);
		System.out.println(ob1.i); // 10
//		ob1.i = 20; --> CTE	
	}

}
