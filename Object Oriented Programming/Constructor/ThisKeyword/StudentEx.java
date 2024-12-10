package com.JSP.ThisKeyword;

class Student {
	String name;
	int age;
	long mob;
	int id;
	
	
	public void display()
	{
		System.out.println(name + " " + age + " " + mob + " " + id);
	}
	
	public void addStudent(String name, int age, long mob, int id)
	{
		// Here left side variables are also local variables. So we are assigning local value to same local value.
		name = name;
		age = age;
		mob = mob;
		id = id;
		
		// To give the value, to non-static/instance variable we have to use "this" keyword like :-
		
		/*
			this.name = name;
			this.age = age;
			this.mob = mob;
			this.id = id;
		 */
	}
	
}

public class StudentEx {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.addStudent("Tanmay", 23, 996732145, 1011);
		s1.display(); // Null 0 0 0
	}

}
