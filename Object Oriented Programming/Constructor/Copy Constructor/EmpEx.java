package com.JSP.Constructor.CopyConstructor;

public class EmpEx {
	
	String name;
	int age;
	int id;
	long mobNum;
	int sal;
	
	EmpEx()
	{
		
	}
	
	EmpEx(String n, int a, int i, long m, int s)
	{
		name = n;
		age = a;
		id = i;
		mobNum = m;
		sal = s;
	}
	
	EmpEx(EmpEx ob)
	{
		name = ob.name;
		age = ob.age;
		id = ob.id;
		mobNum = ob.mobNum;
		sal = ob.sal;
	}
	
	public void display()
	{
		System.out.println("Name : "+name + "\n" + "Age : "+ age + "\n" + "Id : "+ id + "\n" + "Mobile No. : "+mobNum + "\n"+ "Salary : "+sal );
	}	

	public static void main(String[] args) {
			
		EmpEx ob1 = new EmpEx();
		EmpEx ob2 = new EmpEx("Debiprasad", 22, 1800, 98765432, 15000);
		EmpEx ob3 = new EmpEx(ob1);
		EmpEx ob4 = new EmpEx(ob2);
		
		System.out.println("Object - 1 :- ");
		ob1.display();
		System.out.println("=======================================================");
		System.out.println("Object - 2 :- ");
		ob2.display();
		System.out.println("=======================================================");
		System.out.println("Copy Constructor of object - 1 :- ");
		ob3.display();
		System.out.println("=======================================================");
		System.out.println("Copy Constructor of object - 2 :- ");
		ob4.display();
		
	}

}
