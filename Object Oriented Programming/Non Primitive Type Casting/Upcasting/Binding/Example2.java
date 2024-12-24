package com.JSP.Non_Primitive_Type_Casting.Upcasting.Binding;

class AA {
	static void m1()
	{
		System.out.println("M1()-AA");
	}
	static void m1(int i)
	{
		System.out.println("M1(int i)-AA");
	}
}
class BB extends AA {
	static void m1()
	{
		System.out.println("M1()-BB");
	}
	static void m1(int i)
	{
		System.out.println("M1(int i)-BB");
	}
}

public class Example2 {

	public static void main(String[] args) {
		
		AA a1 = new BB();
		a1.m1();  // M1()-AA --> Early Binding
		a1.m1(10); // M1(int i)-AA --> Early Binding

	}

}
