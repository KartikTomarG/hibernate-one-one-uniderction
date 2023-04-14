package com.ansari.hibernate_one_to_many_project.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {

	@Id
	private int bookId;
	private String bookName;
	private String bookAuthor;
	private double bookPrice;
	
	@Override
	public String toString() {
		return "\nBook [\nBook Id = " + bookId + "\nBook Name = " + bookName + "\nBook Author = " + bookAuthor + "\nBook Price = "
				+ bookPrice + "\n]\n";
	}
	
	public Book() {
		super();
	}

	public Book(int bookId, String bookName, String bookAuthor, double bookPrice) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
	}

	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	
	
}
