package com.ExceptionHandling;

public class Example3 {

	public static void main(String[] args) 
	{
		System.out.println(10 / 0.0); // Infinity
		System.out.println(50 % 0.0); // NaN
		System.out.println(10 / 0); // ArithmeticException
		System.out.println(50 % 0); // ArithmeticException
	}
}
