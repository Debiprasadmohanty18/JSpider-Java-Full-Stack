package com.Oops.WrapperClass;

public class AutoUnboxingEx1 {

	public static void main(String[] args) {
		
		Integer a = new Integer(100);
		int b = a; // AutoUnBoxing
		System.out.println("Non-Primitive Value : " + a);
		System.out.println("Primitive Value : " + b);
		
		int c = a.intValue(); // UnBoxing Before JDK-1.5
		System.out.println("Primitive Value : " + c);
		
		int n = new Integer(40); // UnBoxing Before JDK-1.5
		System.out.println("Primitive Value : " + n);

	}

}
