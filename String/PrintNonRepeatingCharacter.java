package com.String;

/*

1 - input :- "JAVA"    ,     Output :- "JV"
 
*/

public class PrintNonRepeatingCharacter {

	public static void main(String[] args) 
	{
		String s1 = "java";
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
				}
				
			}
			if(count>1)
				ch[i] = '\u0000';
			else 
				res += ch[i];
		}
		
		System.out.println("Before Removing Non-Repeating Character :- " + s1);
		System.out.println("After Removing Non-Repeating Character :- " + res);
	}

}
