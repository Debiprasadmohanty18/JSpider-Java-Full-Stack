package com.ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionExample {

	public static void main(String[] args) {
		System.out.println("Main Starts");
		try {
			FileReader f1 = new FileReader("C:\\JAVA\\Arraylist.java");
			System.out.println("Reading Data");
		}catch (FileNotFoundException e) {
			System.out.println("Handled");
		}
		System.out.println("Main Ends");
	}

}


/*
Output-1 :- (If File Is Present)

	Main Starts
	Reading Data
	Main Ends

----------------------------------
Output-2 :- (If File is not Present)

    Main Starts
    Handled
    Main Ends

*/
	

