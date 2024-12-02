package com.JSP.Blocks;

public class BothEx1 {
	
	static 
	{
		System.out.println("Static Block - 1");
		new BothEx1();
	}
	
	{
		System.out.println("Non-Static Block - 1");
	}

	public static void main(String[] args) {
		System.out.println("Main Starts");
		new BothEx1();
		System.out.println("Main Ends");
	}
	
	static 
	{
		System.out.println("Static Block - 2");
	}
	
	{
		System.out.println("Non-Static Block - 2");
	}	
	
	{
		System.out.println("Non-Static Block - 3");
	}

	static 
	{
		System.out.println("Static Block - 3");
	}
}
