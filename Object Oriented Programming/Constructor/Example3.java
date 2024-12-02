package com.JSP.Constructor;

public class Example3 {
	
	Example3(int i)
	{
		System.out.println("Example3(int i) : " + i);
	}

	public static void main(String[] args) {
		
//		new Example3(); // Compile Time Error
//		new Example3(10.45); // Compile Time Error
		
		new Example3(10); // Example3(int i) :  + 10
		new Example3(90); // Example3(int i) :  + 90

	}

}
