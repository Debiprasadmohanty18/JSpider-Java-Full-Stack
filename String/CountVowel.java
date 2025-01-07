package com.String;

/*

1 - Input :- "RAMANA"    ,   output :- 3
2 - Input :- "JSPIDER"  ,   output :- 2  
 
*/

public class CountVowel {

	public static void main(String[] args) {
		
		String s = "JSPIDER";
		int countVowel = 0;
		
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				countVowel++;
		}
		System.out.println("No. of vowel present in " + "\"" + s + "\"" + " is : " + countVowel);
	}

}
