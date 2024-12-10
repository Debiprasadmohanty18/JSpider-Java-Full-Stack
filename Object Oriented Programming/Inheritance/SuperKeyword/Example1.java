package com.JSP.Inheritance.SuperKeyword;

class A {
	int i=10;
}

class B extends A {
	int i=20;
	public void display()
	{
		System.out.println("this.i :- " + this.i); // 20
		System.out.println("super.i :- " + super.i); // 10
		System.out.println("i :- " + i); // 20
	}
}

public class Example1 {

	public static void main(String[] args) {
		
		B ob1 = new B();
		ob1.display();		

	}

}
