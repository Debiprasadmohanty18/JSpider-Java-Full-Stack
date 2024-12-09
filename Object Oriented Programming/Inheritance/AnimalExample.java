package com.JSP.Inheritance;

class Animal {
	void eat()
	{
		System.out.println("Eating...");
	}
}

class Dog extends Animal {
	void bark()
	{
		System.out.println("Barking...");
	}
}

class BabyDog extends Dog {
	void weep()
	{
		System.out.println("Weeping...");
	}
}

class Cat extends Animal {
	void sound()
	{
		System.out.println("Meowwwwww");
	}
}

public class AnimalExample {

	public static void main(String[] args) {
		
		Animal  a = new Animal();
		a.eat();
//		a.bark(); --> CTE
		System.out.println("==========");
		Dog d = new Dog();
		d.bark();
		a.eat();
//		d.weep(); --> CTE
		System.out.println("==========");
		BabyDog b = new BabyDog();
		b.weep();
		b.bark();
		b.eat();
//		b.sound(); --> CTE
		System.out.println("==========");
		Cat c = new Cat();
		c.sound();
		c.eat();
//		c.bark(); --> CTE
 
	}

}
