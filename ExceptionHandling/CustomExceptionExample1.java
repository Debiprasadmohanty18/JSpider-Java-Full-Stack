package com.ExceptionHandling;

class AgeInvalidException extends Exception {
	
}

public class CustomExceptionExample1 {
	public static void main(String[] args) throws AgeInvalidException {
		int age = 45;
		if(age >= 25 && age <= 35)
			System.out.println("Eligible");
		else 
		{
			AgeInvalidException ob1 = new AgeInvalidException();
			throw ob1;
		}
	}
}
