package com.JSP.SingletonClass;

class A {
	
	private static A obj;
	
	private A()
	{
		
	}
	
	public static A getObject()
	{
		if(obj == null)
		{
			obj = new A();
			return obj;
		}
		else 
		{
			return obj;
		}
	}
	
}

public class Example1 {
	
	public static void main(String[] args) {
		
//		A ob	= new A();  // CTE
		
		A ob1 = A.getObject();
		A ob2 = A.getObject();
		A ob3 = A.getObject();
		
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(ob3);
		
		System.out.println(ob1 == ob2);
		System.out.println(ob2 == ob3);
		System.out.println(ob1 == ob3);
		
	}

}
