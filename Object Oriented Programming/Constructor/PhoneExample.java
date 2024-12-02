package com.JSP.Constructor;

public class PhoneExample {
	
	static int count = 0;
	
	public PhoneExample()
	{
		count++;
	}

	public static void main(String[] args) {
		
		new PhoneExample();
		new PhoneExample();
		new PhoneExample();
		new PhoneExample();
		new PhoneExample();
		System.out.println("Count :- "+ count); // 5
	}

}
