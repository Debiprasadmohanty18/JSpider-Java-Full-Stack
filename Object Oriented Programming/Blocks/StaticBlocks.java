package com.JSP.Blocks;

public class StaticBlocks {
	
	static {
		System.out.println("Static Block - 1");
	}

	public static void main(String[] args) {
		System.out.println("Main Starts");
		System.out.println("Main Ends");
	}
	
	static {
		System.out.println("Static Block - 2");
	}
	
	static {
		System.out.println("Static Block - 3");
	}

}
