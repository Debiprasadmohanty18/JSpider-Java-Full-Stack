package com.JSP.ConstructorOverloading;

public class B {
	int i;
	int j;
	int k;
	B() { }
	
	B(int i)
	{
		this.i = i;
	}
	
	B(int i, int j)
	{
		this.i = i;
		this.j = j;
	}
	
	public void display()
	{
		System.out.println(i + " " + j + " " + k);
	}

	public static void main(String[] args) {
		
		B b1 = new B();
		b1.display();       // 0 0 0
		B b2 = new B(10);
		b2.display();       // 10 0 0
		B b3 = new B(18, 45);
		b3.display();       // 18 45 0

	}

}
