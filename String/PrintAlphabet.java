package com.String;

/*

1 - Input :- "1#A@B23C"    ,   output :- "ABC"
2 - Input :- "!PY$&T78H(O^N"  ,   output :- "PYTHON"  
 
*/

public class PrintAlphabet {

	public static void main(String[] args) {
		
		String s = "!PY$&T78H(O^N";		
		String res = "";
		
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
				res+=ch;
		}
		
		System.out.println("Alphabet present in " + "\"" + s + "\"" + " is : " + res);

	}

}
