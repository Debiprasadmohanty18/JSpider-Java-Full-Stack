package com.String;

/*

1 - Input :- "Ja12va is 143 o7op La26ng2"     ,      Output :- 190

*/

public class SumOfNumberPresentInWord {

	public static void main(String[] args) 
	{
		String s1 = "Ja12va is 143 o7op La26ng2";
/*
	  // Approach - 1 :-
	  	
		String res = "";
		int sum = 0;		
		for(int i=0;i<s1.length();i++)
		{
			char ch = s1.charAt(i);
			
			if(ch>='0' && ch<='9')
			{
				res += ch;
			}
			else 
			{
				if(res != "")
				{
					int num = Integer.parseInt(res);
					sum += num;
					res="";
				}
			}
			
			if(i == s1.length()-1 && (ch>='0' && ch<='9'))
			{
				int num = Integer.parseInt(res);
				sum += num;
			}
		}
		
		System.out.println(sum);
		
		*/
		
		
		// Approach - 2 :-
		
		int sum = 0;
		int res = 0;
		
		
		for(int i=0;i<s1.length();i++)
		{
			char ch = s1.charAt(i);
			if(ch>='0' && ch<='9')
			{
				sum = (sum*10) + (ch-'0');
			}
			else if(!(ch>='0' && ch<='9'))
			{
				res+=sum;
				sum = 0;
			}
			if(ch==' ' || i == s1.length()-1)
			{
				res+=sum;
				sum = 0;
			}
		}
		
		System.out.println(res);
	}

}
