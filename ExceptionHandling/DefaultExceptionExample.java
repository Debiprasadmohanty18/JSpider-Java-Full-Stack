package com.ExceptionHandling;

public class DefaultExceptionExample {
	public static void main(String[] args) {
		System.out.println("Main Starts"); // 1
		try {
			m1();
		}catch(Exception e) {
			e.printStackTrace(); // 4
			System.out.println(e.getMessage()); // 5
			System.out.println("Handled"); // 6
		}
		
		System.out.println("Main Ends"); // 7
	}
	
	static void m1()
	{
		System.out.println("M1() Executed"); // 2
		m2();
	}
	
	static void m2()
	{
		System.out.println("M2() Executed"); // 3
		System.out.println(10/0);
	}
}
