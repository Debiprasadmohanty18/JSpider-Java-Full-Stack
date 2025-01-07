package com.String;

/*

1 - input :- "BOSS"   ,   output :- "BOS$"
2 - input :- "BOSSSS"   ,   output :- "BOS$S$"
 
*/

public class ChangeConsecutiveCharacter {

	public static void main(String[] args) {
		String s = "BOSSSS";
		char[] ch = s.toCharArray();
		
		for(int i=0;i<ch.length-1;i++)
		{
			if(ch[i] == ch[i+1])
				ch[i+1] = '$';
		}
		System.out.println(ch);
	}

}
