package com.JSP.MethodOverriding;

class AA {
	Animal m1()
	{
		System.out.println("m1()-AA");
		return new Animal();
	}
}
class BB extends AA {
	@Override
	public Dog m1()
	{
		System.out.println("m1()-BB");
		return new Dog();
	}
}
class CC extends BB {
	@Override
	public BabyDog m1()
	{
		System.out.println("m1()-CC");
		return new BabyDog();
	}
}

public class Example3 {

	public static void main(String[] args) {

		CC c1 = new CC();
		c1.m1();		

	}

}
