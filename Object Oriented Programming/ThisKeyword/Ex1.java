package com.JSP.ThisKeyword;

public class Ex1 {
	
	int i;
	
	public void display(int i)
	{
		System.out.println(i);
		System.out.println(this.i);
	}

	public static void main(String[] args) {
			
		Ex1 ob = new Ex1();
		ob.i = 20;
		ob.display(100); // 100 20
		
		System.out.println("================");
		
		Ex1 ob1 = new Ex1();
		ob1.i = 200;
		ob1.display(10); // 10 200

	}

}
