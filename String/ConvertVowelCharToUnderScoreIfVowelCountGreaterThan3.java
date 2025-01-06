package com.String;

public class ConvertVowelCharToUnderScoreIfVowelCountGreaterThan3 {

	public static void main(String[] args) {
		
		String s = "  Java  ";
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
