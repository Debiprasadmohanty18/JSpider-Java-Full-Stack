package com.String;

public class CountWordsWithOutSplitFunc {

	public static void main(String[] args) 
	{
		String s1 = "  Java    is    Easy  ";
		char[] ch = s1.toCharArray();
		int count = 0;
		
		for(int i=0;i<s1.length();i++)
		{
			if(ch[i] != ' ')
			{
				count++;
				while(ch[i] != ' ')
				{
					if(i == s1.length()-1)
						break;
					i++;
				}
			}
		}
		
		System.out.println(count);
		
		
	}

}
