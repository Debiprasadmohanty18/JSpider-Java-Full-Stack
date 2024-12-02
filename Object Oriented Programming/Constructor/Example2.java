package com.JSP.Constructor;

public class Example2 {
	
	Example2(int i)
	{
		System.out.println("Example2(int i) : " + i);
	}

	public static void main(String[] args) {
		
//		new Example2(); // Compile Time Error
//		new Example2(10.45); // Compile Time Error
		
		new Example2(10); // Example2(int i) :  + 10
		new Example2(90); // Example2(int i) :  + 90

	}

}
