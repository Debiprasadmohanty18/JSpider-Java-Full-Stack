package com.JSP.ThisKeyword;

public class Ex2 {

	int i;
	int j;
	
	public void add(int a , int b)
	{
		i = a;
		j = b;
	}
	
	public void display(int i, int j)
	{
		Ex2 b = new Ex2();
		System.out.println(i + " " + j); 
		System.out.println("============");
		System.out.println(this.i + " " + this.j);
		System.out.println("============");
		System.out.println(b.i + " " + b.j);
	}
	
	public static void main(String[] args) 
	{
		Ex2 e = new Ex2();
		e.add(10, 20);
		e.display(30, 40); // 30 40 10 20 0 0
	}
}
