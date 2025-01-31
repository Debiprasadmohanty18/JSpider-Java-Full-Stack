package com.ExceptionHandling;

public class Example5 {
	public static void main(String[] args) {
		System.out.println("Main Starts"); // 1
		System.out.println("Database Open"); // 2
		try {
			System.out.println(10/0); // 4(Exception)
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Handled");
		}
		finally {
			System.out.println("Database Closed"); // 3
		}
		System.out.println("Main Ends");
	}
}
