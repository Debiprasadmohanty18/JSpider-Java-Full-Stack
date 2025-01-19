package com.ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Example7 {
	public static void main(String[] args) {
		System.out.println("Main Starts"); 
		try {
			m1();
		}catch (Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			System.out.println("Handled");
		}
		
		System.out.println("Main Ends"); 
	}
	
	static void m1() throws FileNotFoundException, ClassNotFoundException
	{
		System.out.println("M1() Starts"); 
		FileReader f1 = new FileReader("C:\\JAVA\\Arraylist.java");
		System.out.println("Reading Data"); 
		System.out.println("M1() Ends"); 
	}
}


/*
Output-1 :- (If File Is Present)

	Main Starts
	M1() Starts
	Reading Data
	M1() Ends
	Main Ends

----------------------------------
Output-2 :- (If File is not Present)

    Main Starts
    M1() Starts
    PrintStack
    Description
    Handled
    Main Ends

*/