package com.JSP.ObjectClass;

public class ToStringMethodExample1 {
	int i;
	int j;
	
	public ToStringMethodExample1(int i, int j) {
		this.i = i;
		this.j = j;
	}

	@Override
	public String toString() {
		return "i = " + i + ", j = " + j;
	}
	
	public static void main(String[] args) {
		ToStringMethodExample1 ob1 = new ToStringMethodExample1(10, 20);
		System.out.println(ob1.toString());
		ToStringMethodExample1 ob2 = new ToStringMethodExample1(50, 70);
		System.out.println(ob2);
	}
	
}
