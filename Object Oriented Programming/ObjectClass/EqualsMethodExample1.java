package com.JSP.ObjectClass;

public class EqualsMethodExample1 {

	int i;
	int j;	
	public EqualsMethodExample1(int i, int j) 
	{
		this.i = i;
		this.j = j;
	}

	@Override
	public boolean equals(Object obj) 
	{
		EqualsMethodExample1 ob = (EqualsMethodExample1) obj; // Down-Casting
		return i == ob.i && j == ob.j;
	}

	public static void main(String[] args) {
		EqualsMethodExample1 ob1 = new EqualsMethodExample1(18, 45);
		EqualsMethodExample1 ob2 = new EqualsMethodExample1(18, 45);
		
		System.out.println(ob1 == ob2); // False
		System.out.println(ob1.equals(ob2)); // True
	}

}
