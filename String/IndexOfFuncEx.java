package com.String;

public class IndexOfFuncEx {

	public static void main(String[] args) {
		
		String s1 = "javadev";
		
		System.out.println(s1.indexOf('a')); // 1
		System.out.println(s1.indexOf("dev")); // 4
		System.out.println(s1.indexOf('A')); // -1
		System.out.println(s1.indexOf('a',2)); // 3
		System.out.println(s1.indexOf('a',-1)); // 1

	}

}
