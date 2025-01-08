package com.String;

/*

1 - input :- "aaabbccac"   ,   output :- maxRepeated = a , minRepeated = b
2 - input :- "tayaatkttbybbggkgrrrr"   ,    output :- maxRepeated = t , minRepeated = y
 
*/

public class MaxAndMinRepeatedCharacter {

	public static void main(String[] args) {
		
		String s1 = "aaabbccac";
		char[] ch = s1.toCharArray();
		int maxCount = Integer.MIN_VALUE;
		int minCount = Integer.MAX_VALUE;
		char maxResChar = ' ';
		char minResChar = ' ';
		
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
				maxResChar = ch[i];
			}
			else if(count < minCount) 
			{
				minCount = count;
				minResChar = ch[i];
			}
		}
		
		System.out.println("Maximum Occurance Character in " + "\"" + s1 + "\" is : " + maxResChar);
		System.out.println("Minimum Occurance Character in " + "\"" + s1 + "\" is : " + minResChar);


	}

}
