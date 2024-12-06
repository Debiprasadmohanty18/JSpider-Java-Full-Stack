package com.JSP.FactoryMethod;

import java.util.Scanner;

public class BookExample {
	String name;
	String author;
	int price;
	
	public BookExample(String name, String author, int price)
	{
		this.name = name;
		this.author = author;
		this.price = price;
	}
	
	public void display()
	{
		System.out.println("Book Name :- " + name + "\n" + "Author Name :- " + author + "\n" + "Price :- " + price);
	}
	
	public static BookExample createBook()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Book Name :- ");
		String bName = sc.nextLine();
		System.out.print("Enter Author Name :- ");
		String bAuthor = sc.nextLine();
		System.out.print("Enter Book Price :- ");
		int bPrice = sc.nextInt();
		System.out.println();
		
		return new BookExample(bName, bAuthor, bPrice);
	}

	public static void main(String[] args) {
		
		BookExample ob1 = BookExample.createBook();
		ob1.display();
		System.out.println("==================");
		BookExample ob2 = BookExample.createBook();
		ob2.display();
		System.out.println("==================");
		BookExample ob3 = BookExample.createBook();
		ob3.display();

	}

}
