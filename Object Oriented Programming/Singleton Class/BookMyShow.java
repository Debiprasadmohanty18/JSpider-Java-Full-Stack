package com.JSP.SingletonClass;

class Theater {
	int seats = 50;
	static private Theater t;
	
	private Theater()
	{
		
	}
	
	public static Theater getObject()
	{
		if(t == null)
		{
			t = new Theater();
			return t;
		}
		else 
		{
			return t;
		}
	}
	
	public void bookTicket(int n)
	{
		if(n <= seats)
		{
			System.out.println(n + " Seats is Booked");
			seats -= n;
			System.out.println(seats + " Seats is Available");
		}
		else 
		{
			System.out.println("You are trying to book "+ n + " Seats");
			n -= seats;
			System.out.println(seats + " Seats is Available");
			System.out.println(n + " Seats is not Available");
		}
	}
	
}

public class BookMyShow {

	public static void main(String[] args) {
		
//		Theater ob = new Theater();  --> CTE
		
		Theater ob1 = Theater.getObject();
		ob1.bookTicket(18);
		Theater ob2 = Theater.getObject();
		ob2.bookTicket(22);
		Theater ob3 = Theater.getObject();
		ob3.bookTicket(12);
	}

}
