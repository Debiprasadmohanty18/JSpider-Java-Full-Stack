package com.String;

public class StringPermutation {

	public static void main(String[] args) 
	{
		String s1 = "abc";
		isPermutation(s1, 0, s1.length()-1);
	}

	static void isPermutation(String s1, int st, int end) 
	{
		if(st == end) 
		{
			System.out.println(s1);
			return;
		}
		for(int i=st;i<=end;i++)
		{
			s1 = swap(s1, st, i);
			isPermutation(s1, st+1, end);
		}
	}

	private static String swap(String s1, int i, int j) {
		char[] ch = s1.toCharArray();
		char temp = ' ';
		temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
		
		return new String(ch);
	}

}
