package com.String;

/*

1 - Input :- "Java Is Easy"    ,   output :- "Easy Is Java"
 
*/

public class ReverseTheSentence {

	public static void main(String[] args) {
		
		String s1 = "Java Is Easy";
		String res = "";
	
  	// Approach-1
 	
		int i = s1.length()-1;
		int j = s1.length()-1;
		
		while(j>=0)
		{
			while(j>=0 && s1.charAt(j) != ' ')
				j--;
			
			int k = j+1;
			
			while(k <= i)
			{
				res += s1.charAt(k);
				k++;
			}
			
			if(j>=0)
				res += " ";
			
			j--;
			i = j;
		}

		
/*
		// Approach - 2
		
		String s2 = "";
		for(int i=s1.length()-1;i>=0;i--)
			s2 += s1.charAt(i);
		
		int i = 0;
		int j = 0;
		
		while(j<s2.length())
		{
			while(j<s2.length() && s2.charAt(j) != ' ')
			{
				j++;
			}
			
			int k = j-1;
			while(k>=i)
			{
				res += s2.charAt(k);
				k--;
			}
			
			if(j<s2.length())
				res += " ";
			
			j++;
			i = j;
		}
		
*/
		
		System.out.println("Original String : " + s1);
		System.out.println("Reverse Sentence String : " + res);
	}

}
