package com.JSP.ThisKeyword;

class Students {
	String name;
	int age;
	int id;
	long mobnum;
	
	Students() { }
	
	Students(String name)
	{
		this();
		this.name = name;
	}
	
	Students(String name,int age)
	{
		this(name);
		this.age = age;
	}
	
	Students(String name, int age, int id)
	{
		this(name,age);
		this.id = id;
	}
	
	Students(String name, int age, int id, long mobnum)
	{
		this(name,age,id);
		this.mobnum = mobnum;
	}
	
	public void display()
	{
		System.out.println("Name : " + name + "\n" + "Age : " + age + "\n" + "Student id : " + id + "\n" + "Mobile No. :- " + mobnum);
	}
		
}

public class ThisFunctionEx2 {

	public static void main(String[] args) {
		
		Students s1 = new Students("Virat", 36, 18, 987654321);
		s1.display(); // Virat 36 18 987654321
		System.out.println("===========================");
		Students s2 = new Students("Debiprasad", 22, 35, 919191827);
		s2.display(); // Debiprasad 22 35 919191827

	}

}
