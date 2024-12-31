package com.JSP.Encapsulation;

class A {
	private int i;
	private int j;
	public A(int i, int j) 
	{
		this.i = i;
		this.j = j;
	}
	
	public int getI() 
	{
		return i;
	}
	public void setI(int i) 
	{
		this.i = i;
	}
	
	public int getJ() 
	{
		return j;
	}
	public void setJ(int j) 
	{
		this.j = j;
	}
	
}

public class Example1 {

	public static void main(String[] args) {
		A ob1 = new A(10,20);
//		System.out.println(ob1.i);
//		System.out.println(ob1.j);
		System.out.println(ob1.getI());
		System.out.println(ob1.getJ());
//		ob1.i = 100; --> CTE
//		ob1.j = 200; --> CTE
		ob1.setI(100);
		ob1.setJ(200);
		System.out.println(ob1.getI());
		System.out.println(ob1.getJ());		
	}

}
