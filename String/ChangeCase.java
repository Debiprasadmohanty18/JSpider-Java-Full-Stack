package com.String;

/*

1 - Input :- "aAbCdEf"      ,      output :- "AaBcDeF" 
2 - Input :- "Java"       ,       Output :- "jAVA"
 
*/

public class ChangeCase {

	public static void main(String[] args) 
	{
		String s1 = "aAbCdEf";
		char[] ch = s1.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='a' && ch[i]<='z')
			{
				ch[i]-=32;
			}
			else if(ch[i]>='A' && ch[i]<='Z')
			{
				ch[i]+=32;
			}
			
		}
		
		System.out.println("Original String : " + s1);
		System.out.print("Resultant String : ");
		System.out.println(ch);
	}

}
