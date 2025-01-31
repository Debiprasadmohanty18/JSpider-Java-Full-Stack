package com.ExceptionHandling;

public class Example4 {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		try {
			System.out.println(a[5]/0); // ArrayIndexOutOfBoundsException
		}catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
}
