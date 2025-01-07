package com.String;

/*
 
 1 - input :- "I Love Java"    ,   output :- "_ L_v_ J_v_"
 2 - input :- "Java"    ,   output :- "Java"
 3 - input :- "Javvaaa"    ,   output :- "J_vv___"
 
*/

public class ConvertVowelCharToUnderScoreIfVowelCountGreaterThan3 {

	public static void main(String[] args) {
		
		String s = "I Love Java";
		char[] ch = s.toCharArray();
		int vowelCount = 0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' || ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U')
				vowelCount++;
		}
		
		if(vowelCount > 3)
		{
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' || ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U')
					ch[i] = '_';
			}
			System.out.println(ch);
		}
		else 
		{
			System.out.println(s);
		}
		
			

	}

}
