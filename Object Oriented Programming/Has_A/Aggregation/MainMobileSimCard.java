package com.JSP.Has_A.Aggregation;

public class MainMobileSimCard {

	public static void main(String[] args) {

		Mobile m1 = new Mobile("Google Pixel", "Golden", 8, 128);
		m1.displayMobile();
		System.out.println("=====================");
		SimCard s1 = new SimCard("Airtel", 773555667);
		m1.insertSim(s1);
//		m1.s.name = "Jio"; --> We can change the SimCard Name like this.
		m1.displayMobile();

	}

}
