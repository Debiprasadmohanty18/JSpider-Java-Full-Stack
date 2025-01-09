package com.String;

/*

1 - Input : "Happy Happy Birth Day"   ,    Output : "Happy Birth Day"
2 - Input : "Bengaluru is a Bengaluru City"    ,    Output :- "Bengaluru is a City"
 
*/

public class RemoveDuplicateWords {

	public static void main(String[] args) 
	{
		String s1 = "Bengaluru is a Bengaluru City";
		String[] str = s1.split(" ");
		String res = "";
		
		for(int i=0;i<str.length;i++)
		{
			if(str[i] == "")
				continue;
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].equals(str[j]))
					str[j] = "";
			}
			res += str[i];
			if(i != str.length-1)
				res +=" ";
		}
		
		System.out.println("Before Removing Duplicates :- " + s1);
		System.out.println("After Removing Duplicates :- " + res);
	}

}
