package com.Oops.Interface;

interface I4 {
	default void m1()
	{
		System.out.println("M1()-I4");
	}
}
interface I5 {
	default void m1()
	{
		System.out.println("M1()-I5");
	}
}
class I implements I4,I5 {
	@Override 
	public void m1()
	{
		I4.super.m1();
		I5.super.m1();
		
		System.out.println("M1()-I");
	}
}

public class JDK8interfaceEx1 {

	public static void main(String[] args) {
		
		I4 i1 = new I();
		i1.m1();

	}

}
