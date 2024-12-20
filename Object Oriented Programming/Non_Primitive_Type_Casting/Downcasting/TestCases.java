package com.JSP.Non_Primitive_Type_Casting.Downcasting;

public class TestCases {

	public static void main(String[] args) {
	
	// Case - 1 :-	
		
		A a = new B();
		C c = (C) a; // Class Cast Exception
		
	// Case - 2 :-
		
		A a = new A();
		B b = (B) a; // Class Cast Exception
		
	//	Case - 3 :-
		
		A a = new C();
		C c = (C) a; // Compile Time Success (No Exception)

	}

}
