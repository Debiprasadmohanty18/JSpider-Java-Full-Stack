package com.JSP.Blocks;

public class NonStaticBlocks {
	
	{
		System.out.println("Non-Static Block - 1");
	}

	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		new NonStaticBlocks();
		System.out.println("=======================");
		new NonStaticBlocks();
		System.out.println("Main Ends");
	}

	{
		System.out.println("Non-Static Block - 2");
	}
	
	{
		System.out.println("Non-Static Block - 3");
	}
}
