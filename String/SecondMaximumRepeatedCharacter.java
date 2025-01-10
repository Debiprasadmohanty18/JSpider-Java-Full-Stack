package com.String;

public class SecondMaximumRepeatedCharacter {

	public static void main(String[] args) 
	{
		String s1 = "jjjaaaaaavvvvv";
		char[] ch = s1.toCharArray();
		int maxCount = -1;
		int secondMax = -1;
		char maxChar = ' ';
		char secMaxChar = ' ';
		
		
		for(int i=0;i<ch.length;i++)
		{
			int count = 1;
			if(ch[i]=='\u0000')
				continue;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					ch[j]='\u0000';
				}
			}
			if(maxCount<count)
			{
				secondMax = maxCount;
				secMaxChar = maxChar;
				
				maxCount = count;
				maxChar = ch[i];
			}
			else if(count != maxCount && count > secondMax)
			{
				secondMax = count;
				secMaxChar = ch[i];
			}
		}
		
		System.out.println(secMaxChar + " = " + secondMax);
	}

}
