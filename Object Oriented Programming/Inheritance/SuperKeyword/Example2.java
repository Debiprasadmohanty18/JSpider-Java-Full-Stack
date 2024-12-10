package com.JSP.Inheritance.SuperKeyword;

class C {
	int i;
	int j;
	
	C(){ }
	
	C(int i, int j)
	{
		this.i = i;
		this.j = j;
	}
	
	public void m1()
	{
		System.out.println("i : "+ i +" , "+"j : " + j);
	}
}

class D extends C {
	
	int i;
	int j;
	D(int i, int j)
	{
		// "super" will assign the value of i and j in parent class's non-static variable.
//		super.i = i;
//		super.j = j;
		// "this" will assign the value of i and j in current class's non-static variable.
		this.i = i;
		this.j = j;
	}
	
	public void m2()
	{
		System.out.println("i : "+ i +" , "+"j : " + j);
	}
	
}

public class Example2 {

	public static void main(String[] args) {
		
		D ob1 = new D(10,20);
		ob1.m1(); // 0 0 
		ob1.m2(); // 10 20		
		
	}

}
