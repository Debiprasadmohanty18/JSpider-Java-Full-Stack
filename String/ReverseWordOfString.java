package com.String;

/*

1 - Input :- "Java Is Easy"    ,   output :- "avaJ sI ysaE"
 
*/

public class ReverseWordOfString {

	public static void main(String[] args) {
		
		String s = "Java Is Easy";
		int i = 0;
		int j = 0;
		String rev = "";
		while(j<s.length())
		{
			while(j<s.length() && s.charAt(j) != ' ')
			{
				j++;
			}
			
			int k = j-1;
			while(k>=i)
			{
				rev += s.charAt(k);
				k--;
			}
			
			if(j<s.length())
				rev += " ";
			
			j++;
			i = j;
		}
		
		System.out.println("Original String : " + s);
		System.out.println("Reverse Word String : " + rev);

	}

}
