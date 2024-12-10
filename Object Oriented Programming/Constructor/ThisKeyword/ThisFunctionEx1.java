package com.JSP.ThisKeyword;

public class ThisFunctionEx1 {
	
	ThisFunctionEx1() { }
	
	ThisFunctionEx1(int i)
	{
		this();
		System.out.println("One Argument Constructor"); // 1st
	}
	
	ThisFunctionEx1(int i, int j)
	{
		this(18);
		System.out.println("Two Arguments Constructor"); // 2nd
	}

	public static void main(String[] args) {
		
		new ThisFunctionEx1(33, 45);

	}

}
