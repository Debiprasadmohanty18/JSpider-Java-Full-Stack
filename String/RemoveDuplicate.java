package com.String;

/*

1 - input :- "abbcaac"   ,   output :- "abc"
2 - input :- "java"   ,   output :- "jav"
 
*/

public class RemoveDuplicate {

	public static void main(String[] args) 
	{
		String s1 = "abbcaac";
		char[] ch = s1.toCharArray();
		String res = "";
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='\u0000') 
				continue;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
					ch[j] = '\u0000';
			}
			res+=ch[i];
		}
		System.out.println(res);
	}

}
