package com.String;

/*

1 - input :- "aaabbccac"   ,   output :- a = 4, b = 2, c = 3
 
*/

public class OccurrenceOfCharacter {

	public static void main(String[] args) {
		
		String s1 = "aaabbccac";
		char[] ch = s1.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			int count = 1;
			if(ch[i]=='\u0000')
				continue;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i] == ch[j])
				{
					count++;
					ch[j] = '\u0000';
				}
			}
			
			System.out.println(ch[i] + " = " + count);
		}

	}

}
