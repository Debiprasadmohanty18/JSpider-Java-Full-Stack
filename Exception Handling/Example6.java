package com.ExceptionHandling;

public class Example6 {

	public static void main(String[] args) 
	{
		try {
			String s = null;
			System.out.println(10/2);
			System.out.println(s.length());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}catch (ArithmeticException e) {
			System.out.println(e);
		}catch (Exception e) {
			System.out.println(e);
		}
//		catch (NullPointerException e) {       ---> Unreachable Lines
//			
//		}
	}

}
