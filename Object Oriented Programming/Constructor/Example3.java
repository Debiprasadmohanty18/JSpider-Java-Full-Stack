package com.JSP.Constructor;

public class Example3 {
	
	int i;
	int j;
	
	Example3(int a, int b)
	{
		i = a;
		j = b;
	}
	
	public void display()
	{
		System.out.println(i + " " + j);
	}

	public static void main(String[] args) {
		
		Example3 ob = new Example3(10, 20);
		ob.display(); // 10 20
		System.out.println("==============");
		Example3 ob1 = new Example3(30, 40);
		ob1.display(); // 30 40

	}

}
