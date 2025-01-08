package com.String;

/*

1 - input :- "banana"   ,   output :- b
2 - input :- "kktatttbgrrrr"   ,    output :- a
 
*/

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		
		String s1 = "kktatttbgrrrr";
		char[] ch = s1.toCharArray();
		
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
				}
			}
			
			if(count == 1)
			{
				System.out.println("First Non-Repeating Character in " + "\"" + s1 + "\"" + " is : " + ch[i]);
				break;
			}
		}

	}

}
