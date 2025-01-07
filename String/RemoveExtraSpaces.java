package com.String;

/*

1 - input :- "  Java   Is Easy  "   ,   output :- "Java Is Easy"
1 - input :- "    Good    Morning  "   ,   output :- "Good Morning"
 
*/

public class RemoveExtraSpaces {

	public static void main(String[] args) 
	{
		String s = "  Java   Is  Easy  ";
		
		//Own Logic
		char[] ch = s.trim().toCharArray();
		String res = "";
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
			{
				res += ' ';
				while(ch[i+1]==' ')
				{
					i++;
				}
			}
			else {
				res+=ch[i];
			}
		}
		System.out.println(res);
	}

}
