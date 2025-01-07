package com.String;

/*

1 - Input :- "125"    ,   output :- 125
2 - Input :- "1GVD#$56S28"   , Output :- 15628
 
*/

public class StringToIntegerWithoutParseFunc {

	public static void main(String[] args) {

		String s = "1GVD#$56S28";
		int num = 0;
		
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch>='0' && ch<='9')
			{
				num = (num*10) + (ch-'0');
			}
		}
		
		System.out.println("Number present in " + "\"" + s + "\"" + " is : " + num);

	}

}
