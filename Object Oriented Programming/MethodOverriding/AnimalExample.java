package com.JSP.MethodOverriding;

class Animal {
	void sound()
	{
		System.out.println("Animal Sound");
	}
}
class Dog extends Animal {
	@Override
	void sound()
	{
		System.out.println("Dog Barking Sound");
	}
}
class BabyDog extends Dog {
	@Override
	void sound() 
	{
		System.out.println("Weeping Sound");
	}	
}
class Cat extends Animal {
	@Override
	void sound()
	{
		System.out.println("Meowwwwwwwwwww");
	}
}

public class AnimalExample {

	public static void main(String[] args) {
		
		BabyDog b1 = new BabyDog();
		b1.sound();
		
		Cat c1 = new Cat();
		c1.sound();

	}

}
