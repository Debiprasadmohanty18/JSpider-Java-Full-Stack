package com.JSP.FinalKeyword;

public class Example1 {

	final static int i = 10;
	final int j;
	final int k;
	Example1(int j, int k) 
	{
		this.j = j;
		this.k = k;
	}
	
	public static void main(String[] args) {
		
//		i += 5; --> Compile Time Error because we cann't change the value of final variable.
		Example1 ob1 = new Example1(30, 40);
		Example1 ob2 = new Example1(60, 70);
//		ob1.j = 80; --> CTE
//		ob1.k = 20; --> CTE
		
		System.out.println(i); // 10
		System.out.println("ob1.j : " + ob1.j); // 30
		System.out.println("ob2.j : " + ob2.j); // 60
		System.out.println("=============");
		System.out.println("ob1.k : " + ob1.k); // 40
		System.out.println("ob2.k : " + ob2.k); // 70
		

	}

}
