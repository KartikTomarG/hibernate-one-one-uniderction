package com.ansari.hibernate_one_to_many_project.service;

import java.util.List;

import com.ansari.hibernate_one_to_many_project.dao.BookDao;
import com.ansari.hibernate_one_to_many_project.dto.Book;

public class BookService {

	BookDao dao = new BookDao();
	
	public Book saveBook(Book book) {
		System.out.println("Data stored");
		return dao.saveBook(book);
	}
	
	public Book bookGetById(int id) {
		return dao.bookGetById(id);
	}
	
	public List<Book> diaplayBook(){
		return dao.diaplayBook();
	}
	
}
