package com.String;

public class NumberToString {

	public static void main(String[] args) 
	{
		int n = 97657001;
		convert(n/10000000, "Crore");
		convert((n/100000)%100, "Lakh");
		convert((n/1000)%100, "Thousand");
		convert((n/100)%10, "Hundred");
		convert(n%100,"");
	}
	static void convert(int n, String s)
	{
		String[] one = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
		String[] two = {"","", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninty"};
		
		if(n<=19)
		{
			System.out.print(one[n] + " ");
		}
		else 
		{
			System.out.print(two[n/10] + " " + one[n%10] + " ");
		}
		
		if(n!=0)
			System.out.print(s + " ");
	}

}
