package com.JSP.Blocks;

public class StaticBlockEx1 {
	int j;
	static int i;
	
	static {
		i = 10;
	}
	
	public static void main(String[] args) {
		System.out.println(StaticBlockEx1.i);
		System.out.println("Main Starts");
		System.out.println(StaticBlockEx1.i);
		System.out.println("Main Ends");
	}
	
	static {
		i = 20;
	}
	
	static {
		i = 30;
	}

}
