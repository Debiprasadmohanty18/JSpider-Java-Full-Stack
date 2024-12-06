package com.JSP.Constructor.CopyConstructor;

public class Ex1 {
	
	int i;
	int j;
	
	Ex1(int i, int j)
	{
		this.i=i;
		this.j=j;
	}
	
	Ex1(Ex1 ob)
	{
		this.i = ob.i;
		this.j = ob.j;
	}
	
	public static void main(String[] args) {
		
		Ex1 ob1 = new Ex1(10, 20);
		
		Ex1 ob2 = new Ex1(ob1);
		
		System.out.println("ob1.i : " + ob1.i + ", " + "ob1.j : " + ob1.j);
		System.out.println("this.i : " + ob2.i+ ", " + "this.j : " + ob2.j);

	}

}
