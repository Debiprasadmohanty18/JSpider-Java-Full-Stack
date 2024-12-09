package com.JSP.Inheritance;

class AA {
	int i=10;
}

class BB extends AA {
	public void m1() 
	{
		i+=20;
	}
}

public class Example2 {

	public static void main(String[] args) {
		
		BB b1 = new BB();
		System.out.println(b1.i); // 10
		b1.m1();
		System.out.println(b1.i); // 30
		System.out.println("======");
		AA a1 = new AA();
		System.out.println(a1.i); // 10

	}

}
