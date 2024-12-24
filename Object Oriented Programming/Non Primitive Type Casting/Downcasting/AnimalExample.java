package com.JSP.Non_Primitive_Type_Casting.Downcasting;

class Animal {
	void eat()
	{
		System.out.println("Animal Eating");
	}
}
class Dog extends Animal {
	@Override
	void eat() {
		System.out.println("Dog Eating");
	}
	
	void bark()
	{
		System.out.println("Dog Sound");
	}	
}
class BabyDog extends Dog {
	@Override
	void eat()
	{
		System.out.println("BabyDog Eating");
	}
	
	void weep()
	{
		System.out.println("Weeping Sound");
	}
}
class Cat extends Animal {
	void sound()
	{
		System.out.println("Cat Sound");
	}
}

public class AnimalExample {

	public static void main(String[] args) {
		
		Animal a1 = new Cat(); // Up-casting (Cat to Animal)
		a1.eat(); // Animal Eating
//		a1.sound(); --> CTE
		Cat c1 = (Cat) a1; // Down-casting(Animal to Cat)
		c1.eat(); // Animal Eating
		c1.sound(); // Cat Sound
		System.out.println("================");
		Animal a2 = new Dog(); // Up-casting (Dog to Animal)
		a2.eat(); // Dog Eating
//		a2.bark(); --> CTE
//		BabyDog b1 = (BabyDog) a2; --> Class Cast Exception
		Dog d1 = (Dog) a2; //Down-casting(Animal to Dog)
		d1.eat(); // Dog Eating
		d1.bark(); // Dog Sound
		System.out.println("================");
		Animal a3 = new BabyDog(); // Up-casting (BabyDog to Animal)
		a3.eat(); // BabyDog Eating
//		a3.bark(); --> CTE
		Dog d2 = (Dog) a3; // Down-casting(Animal to Dog)
		d2.eat(); // BabyDog Eating
		d2.bark(); // Dog Sound
		System.out.println("================");
		BabyDog b2 = (BabyDog) a3; // Down-casting(Animal to BabyDog)
		b2.eat(); // BabyDog Eating
		b2.bark(); // Dog Sound
		b2.weep(); // BabyDog Sound
		
	}

}
