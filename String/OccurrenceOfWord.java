package com.String;

/*

1 - input :- "cat mat bat is cat bad cat bat"   ,   output :- cat = 3, mat = 1, bat = 2, is = 1, bad = 1
 
*/

public class OccurrenceOfWord {

	public static void main(String[] args) {
		
		String s1 = "cat mat bat is cat bad cat bat";
		String[] str = s1.split(" ");
		
		for(int i=0;i<str.length;i++)
		{
			int count = 1;
			if(str[i] == "")
				continue;
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].equals(str[j]))
				{
					count++;
					str[j] = "";
				}
			}
			
			System.out.println(str[i] + " = " + count);
		}

	}

}
