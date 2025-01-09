package com.String;

/*

1 - Input :- "Hello World"    ,     Output :- "He121 W2r3d"
 
*/

public class ConvertRepeatedCharacterToNumber {

	public static void main(String[] args) 
	{
		String s1 = "Hello World";
		char[] ch = s1.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			int count = 1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i] == ch[j])
				{
					count++;
					ch[j] = (char) (count+'0');
				}
			}
			if(count > 1)
				ch[i] = '1';	
		}
		System.out.println(ch);
	}

}
