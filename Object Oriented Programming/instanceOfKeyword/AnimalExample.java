package com.JSP.instanceOfKeyword;

class Animal {
	
}
class Dog extends Animal {
	
}
class BabyDog extends Dog {
	
}
class Cat extends Animal {
	
}

public class AnimalExample {
	public static void main(String[] args) {
		Animal a1 = new Cat();
		System.out.println( a1 instanceof Animal);
		System.out.println( a1 instanceof Cat);
		System.out.println( a1 instanceof Dog);
		System.out.println("==============");
		Animal a2 = new Dog();
		System.out.println( a2 instanceof Animal);
		System.out.println( a2 instanceof Dog);
		System.out.println( a2 instanceof BabyDog);
		System.out.println( a2 instanceof Cat);
		System.out.println("==============");
		Animal a3 = new BabyDog();
		System.out.println( a3 instanceof Animal);
		System.out.println( a3 instanceof Dog);
		System.out.println( a3 instanceof BabyDog);
		System.out.println( a3 instanceof Cat);
		System.out.println("==============");
		Dog d1 = new BabyDog();
		System.out.println( d1 instanceof Animal);
		System.out.println( d1 instanceof Dog);
		System.out.println( d1 instanceof BabyDog);
//		System.out.println( d1 instanceof Cat); --> CTE
	}
}
