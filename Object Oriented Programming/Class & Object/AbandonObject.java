package com.JSP.Object;

public class AbandonObject {
	int i = 10;
	public static void main(String[] args) {
		AbandonObject ob = new AbandonObject();
		System.out.println(ob.i);
		System.out.println(ob.i);
		System.out.println(new AbandonObject().i);
		System.out.println(new AbandonObject().i);
	}

}
