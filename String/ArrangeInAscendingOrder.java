package com.String;

/*

1 - Input :- "bacdabe"    ,    output :- "aabbcde"
 
*/

public class ArrangeInAscendingOrder {

	public static void main(String[] args) 
	{
		String s1 = "bacdabe";
		char[] ch = s1.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i] >= ch[j])
				{
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		System.out.println("Before Arranging :- " + s1);
		System.out.println("After Arranging :- " + new String(ch));
	}

}
