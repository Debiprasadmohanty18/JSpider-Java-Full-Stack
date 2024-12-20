package com.JSP.Non_Primitive_Type_Casting.Upcasting.Binding;

class Animal {
	void makeSound() 
	{
		System.out.println("Animal Sound...");
	}
}
class Dog extends Animal {
	@Override 
	void makeSound()
	{
		System.out.println("Barking Sound...");
	}
}
class Cat extends Animal {
	@Override
	void makeSound() {
		System.out.println("Meoww Sound...");
	}	
}

public class AnimalExample {

	public static void main(String[] args) {
		
		Animal a1 = new Dog();
		a1.makeSound(); // Barking Sound...  (Late Binding)
		
		Animal c1 = new Cat();
		c1.makeSound(); // Meoww Sound... (Late Binding)

	}

}
