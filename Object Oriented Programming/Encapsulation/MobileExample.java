package com.JSP.Encapsulation;

import java.util.Scanner;

class Mobile {
	private String name;
	private String colour;
	private int ram;
	private int rom;
	private double price;
	
	public Mobile(String name, String colour, int ram, int rom, double price) 
	{
		this.name = name;
		this.colour = colour;
		this.ram = ram;
		this.rom = rom;
		this.price = price;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public String getColour() 
	{
		return colour;
	}
	public void setColour(String colour) 
	{
		this.colour = colour;
	}
	public int getRam() 
	{
		return ram;
	}
	public void setRam(int ram) 
	{
		this.ram = ram;
	}
	public int getRom() 
	{
		return rom;
	}
	public void setRom(int rom) 
	{
		this.rom = rom;
	}
	public double getPrice() 
	{
		return price;
	}
	@Override
	public String toString() 
	{
		return "Mobile \n [ \n Name = " + name + "\n Colour = " + colour + "\n Ram = " + ram + "\n Rom = " + rom + "\n Price = " + price + "\n ]";
	}	
}

public class MobileExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean doExit = true;
		Mobile m1 = null;
		
		do
		{
			System.out.println();
			System.out.println("1.Add Mobile\n2.Fetch Details\n3.Fetch Price\n4.Change Colour\n5.Exit");
			System.out.println();
			System.out.println("Enter Your Number :- ");
			int n = sc.nextInt();
			
			switch(n)
			{
			case 1:
			{
				System.out.println("Enter Mobile Details : ");
				String name = sc.next();
				String colour = sc.next();
				int ram = sc.nextInt();
				int rom = sc.nextInt();
				double price = sc.nextDouble();
				m1 = new Mobile(name, colour, ram, rom, price);
			} 
			break;
			
			case 2:
			{
				if(m1 != null)
					System.out.println(m1);
				else
					System.out.println("No Mobile Added");
			} 
			break;
			
			case 3:
			{
				if(m1 != null)
					System.out.println(m1.getPrice());
				else
					System.out.println("No Mobile Added");
			}
			break;
			
			case 4:
			{
				if(m1 != null)
				{
					System.out.println("Old Colour was : " + m1.getColour());
					System.out.println("Enter Which Colour You Want : ");
					String newColour = sc.next();
					m1.setColour(newColour);
					System.out.println("New Colour is : " + m1.getColour());
				}
				else
					System.out.println("No Mobile Added");
			}
			break;
			
			case 5:
			{
				doExit = false;
				System.out.println("Thank You \n   Visit Again... :)");
			}
			break;
			
			default : System.out.println("Invalid Option!!!");
			}
		}while(doExit);
	}

}
