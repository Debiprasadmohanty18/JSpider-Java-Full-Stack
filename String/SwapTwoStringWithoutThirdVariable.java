package com.String;

/*

1 - Input :- s1 = "Rohit", s2 = "Kohli"    ,    output :- s1 = "Kohli" , s2 = "Rohit" 
 
*/

public class SwapTwoStringWithoutThirdVariable {

	public static void main(String[] args) 
	{
		String s1 = "Rohit";
		String s2 = "Kohli";
		System.out.println("Before Swapping :- ");
		System.out.println("s1 :- " + s1);
		System.out.println("s2 :- " + s2);
		
		System.out.println("====================");
		
		s1 = s1+s2;
		s2 = s1.substring(0, s1.length()-s2.length());
		s1 = s1.substring(s2.length());
		System.out.println("After Swapping :- ");
		System.out.println("s1 :- " + s1);
		System.out.println("s2 :- " + s2);
	}

}
