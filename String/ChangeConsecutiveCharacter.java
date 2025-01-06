package com.String;

public class ChangeConsecutiveCharacter {

	public static void main(String[] args) {
		String s = "BOSSSSSs";
		char[] ch = s.toCharArray();
		
		for(int i=0;i<ch.length-1;i++)
		{
			if(ch[i] == ch[i+1])
				ch[i+1] = '$';
		}
		System.out.println(ch);
	}

}
