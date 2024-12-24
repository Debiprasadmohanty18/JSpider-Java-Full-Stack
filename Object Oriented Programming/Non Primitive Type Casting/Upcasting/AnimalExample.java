package com.JSP.Non_Primitive_Type_Casting.Upcasting;

class Animal {
	
}
class Dog extends Animal {
	
}
class BabyDog extends Dog {
	
}
class Cat extends Animal {
	
}

public class AnimalExample {

	public static Animal m1() 
	{
		return new Animal();
//		return new Dog(); --> Up-casting (Dog to Animal) -- Compile Time Success 
//		return new BabyDog(); --> Up-casting (BabyDog to Animal) -- Compile Time Success
//		return new Cat(); --> Up-casting (Cat to Animal) -- Compile Time Success
	}
	
	public static Dog m2()
	{
//		return new Animal(); --> Compile Time Error
		return new Dog(); 
//		return new BabyDog(); --> Up-casting (BabyDog to Animal) -- Compile Time Success
//		return new Cat(); --> Compile Time Error
	}
	
	public static void main(String[] args) {
		
	}
	
}
