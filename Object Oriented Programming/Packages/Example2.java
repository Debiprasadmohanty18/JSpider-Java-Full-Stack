package com.JSP.Packages;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
	    System.out.println("Enter Username :- ");

	    String userName = myObj.nextLine();
	    System.out.println("Username is: " + userName);
	    System.out.println("Here, com.JSP.Packages --> User Defined Package");
	    System.out.println("And, java.util.Scanner --> Pre Defined Package");
	    myObj.close();
	}

}
