package com.JSP.Object;

public class ObjectAsReturnTypeEx1 {
	
	public static A m1()
	{
		A a = new A();
		return a;
	}
	
	public static B m2(B b)
	{
		A a = new A();
		return b;
	}

	public static void main(String[] args) {
		
		A b = m1();
		B ob = new B();
		B c = m2(ob);
		
		System.out.println(b + "\n" + c);
	}

}
