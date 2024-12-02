package com.JSP.Constructor;

public class Example4 {
	
	int i;
	int j;
	
	Example4(int a, int b)
	{
		i = a;
		j = b;
	}
	
	public void display()
	{
		System.out.println(i + " " + j);
	}

	public static void main(String[] args) {
		
		Example4 ob = new Example4(10, 20);
		ob.display(); // 10 20
		System.out.println("==============");
		Example4 ob1 = new Example4(30, 40);
		ob1.display(); // 30 40

	}

}
