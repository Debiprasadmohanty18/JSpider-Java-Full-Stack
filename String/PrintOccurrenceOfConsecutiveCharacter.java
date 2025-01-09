package com.String;

/*

1 - Input :- "aaabbccdecf"    ,     Output :- "a3b2c2decf"
2 - Input :- "aaabbccdecffw"   ,    Output :- "a3b2c2decf2w"
 
*/

public class PrintOccurrenceOfConsecutiveCharacter {

	public static void main(String[] args) 
	{
		String s1 = "aaabbccdecffw";
		char[] ch = s1.toCharArray();
		String res = "";
		
		for(int i=0;i<ch.length;i++)
		{
			int count = 1;
			if(ch[i] == '\u0000')
				continue;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i] == ch[j])
				{
					count++;
					ch[j] = '\u0000';
					if(ch[j] == ch[ch.length-1] || ch[i] != ch[j+1])
						break;
				}
			}
			
			if(count > 1)
				res = res + ch[i] + count;
			else 
				res += ch[i];
		}
		
		System.out.println(res);
	}

}
