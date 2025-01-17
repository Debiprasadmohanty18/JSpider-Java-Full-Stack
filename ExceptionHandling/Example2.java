package com.ExceptionHandling;

public class Example2 {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		System.out.println("Main Starts");
		try {
			System.out.println(a[5]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();   // --> This will print like exception but it prints 1 - Exception Types, 2 - Exception Message ,  3 - The sequence of method call
			System.out.println("Handled");
		}
		System.out.println("Main Ends");
	}

}
