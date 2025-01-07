package com.String;

/*

1 - input :- "1AbcD@#25"    ,   output :- UpperCase :- 2
 										  LowerCase :- 2
 										  Number :- 3
 										  Special character :- 2 
 
*/

public class CaseCount {

	public static void main(String[] args) {
		
		String s = "1AbcD@#25";
		int uc = 0;
		int lc = 0;
		int num = 0;
		int sc = 0;
		
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch>='A' && ch<='Z')
				uc++;
			else if(ch>='a' && ch<='z')
				lc++;
			else if(ch>='0' && ch<='9')
				num++;
			else 
				sc++;
		}
		
		System.out.println("Number of Uppercase present in " + "\"" + s + "\"" + " is : " + uc);
		System.out.println("Number of Lowercase present in " + "\"" + s + "\"" + " is : " + lc);
		System.out.println("Number of Number present in " + "\"" + s + "\"" + " is : " + num);
		System.out.println("Number of Special Character present in " + "\"" + s + "\"" + " is : " + sc);

	}

}
