package com.ExceptionHandling;

public class NestedTryCatchExample {

	public static void main(String[] args) {
		System.out.println("Main Starts");  // 1 
		String s = null;
		
		try {
			System.out.println("OuterTry Block");  // 2
			System.out.println(10/5); // 3
			try {
				System.out.println("InnerTry Block"); // 4
				System.out.println(s.length());
			} catch (ArithmeticException e) {
				System.out.println("InnerCatch Block");
				System.out.println(e);
			}
		}catch (NullPointerException e) {
			System.out.println("OuterCatch Block"); // 5
			System.out.println(e); // 6
		}
		
		System.out.println("Main Ends");  // 7
	}

}
