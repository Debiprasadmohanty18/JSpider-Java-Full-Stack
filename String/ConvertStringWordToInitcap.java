package com.String;

/*

1 - input :- "java is easy"   ,   output :- "Java Is Easy"
2 - input :- "debiprasad mohanty"   ,   output :- "Debiprasad Mohanty"
 
*/

public class ConvertStringWordToInitcap {

	public static void main(String[] args) {
		
		String s = "java is easy";
		
		
		char[] ch = s.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(i==0 || ch[i-1]==' ')
			{
				if(ch[i] >= 'a' && ch[i] <= 'z')
					ch[i] -= 32;
			}
		}
		System.out.println(ch);
	}

}
