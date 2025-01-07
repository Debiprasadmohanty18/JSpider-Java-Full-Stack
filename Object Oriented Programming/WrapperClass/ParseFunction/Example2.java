package com.Oops.WrapperClass.ParseFunction;

public class Example2 {

	public static void main(String[] args) {
		
		Integer a = 100;
		Integer b = 100;
		Integer c = 200;
		Integer d = 200;
		
		System.out.println(a==b); // true
		System.out.println(c==d); // false because memory will store till 127... then How does it store 200 to it.

	}

}
