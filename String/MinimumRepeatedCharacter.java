package com.String;

/*

1 - input :- "aaabbccac"   ,   output :- b
2 - input :- "taaatkttbbbggkgrrrr"   ,    output :- k
 
*/

public class MinimumRepeatedCharacter {

	public static void main(String[] args) {
		
		String s1 = "taaatkttbbbggkgrrrr";
		char[] ch = s1.toCharArray();
		int minCount = Integer.MAX_VALUE;
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
			
			if(count < minCount)
			{
				minCount = count;
				resChar = ch[i];
			}
		}
		
		System.out.println("Minimum Occurance Character in " + "\"" + s1 + "\" is : " + resChar);

	}

}
