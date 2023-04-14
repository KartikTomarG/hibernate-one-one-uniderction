package com.ansari.hibernate_one_to_many_project.controller;

import java.util.Scanner;

import com.ansari.hibernate_one_to_many_project.dto.Book;
import com.ansari.hibernate_one_to_many_project.service.BookService;

public class BookController {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Book book = new Book(); 
		BookService bookService = new BookService();
		
		while(true) {
			
			System.out.println("1.Insert Book\n2.Book get by id");
			int choice = s.nextInt();
			
			switch (choice) {
				case 1: {
					System.out.print("Enter Book id : ");
					book.setBookId(s.nextInt());
					System.out.print("Enter Book name : ");
					book.setBookName(s.next());
					System.out.print("Enter Book author : ");
					book.setBookAuthor(s.next());
					System.out.print("Enter Book price : ");
					book.setBookPrice(s.nextDouble());
					
					bookService.saveBook(book);
				}
				break;
				
				case 2:{
					System.out.print("Enter Book id : ");
					int id = s.nextInt();
					
					Book res = bookService.bookGetById(id);
					
					System.out.println(res.toString());
					
				}
				break;
				
				default:{
					System.out.println("Bye");
					
				}
			}
			
		}
		
	}
	
}
