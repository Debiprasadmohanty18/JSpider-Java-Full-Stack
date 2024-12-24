package com.JSP.Inheritance.SuperKeyword;

class E {
	E()
	{
		System.out.println("E() Constructor."); // 1st
	}
}
class F extends E {
	F()
	{
		System.out.println("F() Constructor."); // 2nd
	}
}
class G extends F {
	G()
	{
		System.out.println("G() Constructor."); // 3rd
	}
}

public class Example3 {

	public static void main(String[] args) {
		
		new G();

	}

}
