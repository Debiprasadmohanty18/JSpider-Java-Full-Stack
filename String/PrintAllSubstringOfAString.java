package com.String;

public class PrintAllSubstringOfAString {
	public static void main(String[] args) {
		String s1 = "MALAYALAM";
		
		for(int i=0;i<s1.length();i++)
		{
			for(int j=i+3;j<s1.length();j++)
			{
				System.out.println(s1.substring(i,j));
			}
		}
	}
}
