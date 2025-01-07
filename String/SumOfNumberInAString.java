package com.String;

/*

1 - Input :- "1AbcD@#25"    ,   output :- 8
2 - Input :- "Ram123"     , output :- 6
 
*/

public class SumOfNumberInAString {

	public static void main(String[] args) {
		
		String s = "1AbcD@#25";
		int sum = 0;		
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch = s.charAt(i);
			if(ch>='0' && ch<='9')
			{
				sum+=(ch-'0');
			}
		}
		
		System.out.println("Sum Of Number present in " + "\"" + s + "\"" + " is : " + sum);

	}

}
