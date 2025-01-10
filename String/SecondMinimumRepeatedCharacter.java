package com.String;

public class SecondMinimumRepeatedCharacter {

	public static void main(String[] args) 
	{
		String s1 = "jjjaaavva";
		char[] ch = s1.toCharArray();
		char minChar = ' ';
		char secMinChar = ' ';
		int minCount = s1.length();
		int secMinCount = s1.length();
		
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
			if(minCount>count)
			{
				secMinCount = minCount;
				secMinChar = minChar;
				
				minCount = count;
				minChar = ch[i];
			}
			else if(count != minCount && count < secMinCount)
			{
				secMinCount = count;
				secMinChar = ch[i];
			}
		}
		
		System.out.println(secMinChar + " = " + secMinCount);
	}

}
