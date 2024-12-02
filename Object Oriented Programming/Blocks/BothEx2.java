package com.JSP.Blocks;

class Example {
	
	int i;
	static int j;
	
	{
		System.out.println("Non-Static Block - 1 - Example"); // 7.1th
		i=10;
		j=20;
	}
	
	static
	{
		System.out.println("Static Block - 1 - Example");  // 4th
		j=30;
	}
	
	{
		System.out.println("Non-Static Block - 2 - Example"); // 7.2th
		i=40;
		j=50;
	}
	
	static
	{
		System.out.println("Static Block - 2 - Example");  // 5th
		j=60;
	}
	
}

public class BothEx2 {

	static
	{
		System.out.println("Static Block - 1 - MainClass"); // 1st 
	}
	
	public static void main(String[] args) {
		System.out.println("Main Starts"); // 3rd
		System.out.println(Example.j);  // 6th
		
		Example ob = new Example(); // 7th
		System.out.println(ob.i);  //8th
		System.out.println(ob.j);  // 9th
		System.out.println("Main Ends");  // 10th
	}

	static
	{
		System.out.println("Static Block - 2 - MainClass"); // 2nd
	}
}
