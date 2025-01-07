package com.String;

/*

1 - Input :- "1AbcD@#25"    ,   output :- "125@#bcAD"
 
*/

public class ArrangeCharInAFormat {

	public static void main(String[] args) {
		
		String s = "1AbcD@#25";
		String numString = "";
		String uPString = "";
		String scString = "";
		String lcString = "";
		
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch>='A' && ch<='Z')
				uPString+=ch;
			else if(ch>='a' && ch<='z')
				lcString += ch;
			else if(ch>='0' && ch<='9')
				numString += ch;
			else 
				scString += ch;
		}
		
		String res = numString+scString+lcString+uPString; 
		
		System.out.println("Before Arranging String was : " + s);
		System.out.println("After Arranging String is : " + res);

	}

}
