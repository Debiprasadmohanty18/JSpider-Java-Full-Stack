package com.JSP.Inheritance;

class AB {
	int i=10;
	void m1()
	{
		i+=20;
	}
}

class BC extends AB {
	int j=20;
	void m2()
	{
		System.out.println("i : "+i + " "+ " j : "+j);
		i+=50;
	}
}

public class Example3 {

	public static void main(String[] args) {
		
		BC b1 = new BC();
		b1.m2(); // 10 20
		b1.m1(); // No Output
		b1.m2(); // 80 20
		System.out.println(b1.i); // 130

	}

}
