package com.String;

/*

1 - input :- "aaabbccac"   ,   output :- a
2 - input :- "kktatttbgrrrr"   ,    output :- t
 
*/

public class MaximumRepeatedCharacter {

	public static void main(String[] args) 
	{	
		String s1 = "kktatttBbgrrr";
		char[] ch = s1.toCharArray();
		int maxCount = Integer.MIN_VALUE;
		char resChar = ' ';
		
		for(int i=0;i<ch.length;i++)
		{
			int count = 1;
			if(ch[i] == '\u0000')
				continue;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i] == ch[j]) {
					count++;
					ch[j] = '\u0000';
				}
				
			}
			
			if(count > maxCount)
			{
				maxCount = count;
				resChar = ch[i];
			}
		}
		
		System.out.println("Maximum Occurance Character in " + "\"" + s1 + "\" is : " + resChar);
	}

}
