package com.ansari.hibernate_one_to_many_project.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ansari.hibernate_one_to_many_project.dto.Book;
import com.ansari.hibernate_one_to_many_project.dto.Student;
import com.ansari.hibernate_one_to_many_project.service.BookService;

public class StudentDao {

	EntityManager entityManager = Persistence.createEntityManagerFactory("kartik").createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	BookService bookService = new BookService();
	
	public Student saveStudent(Student student) {
		
		bookService.bookGetById(101);
		
		List<Book> books = bookService.diaplayBook();
		
		student.setBook(books);
		
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		
		return student;
		
	}
	
	
	
	public Student updateBookPrice(int studentId, double price, int bookId) {
		
		Student student = entityManager.find(Student.class, studentId);
		
		List<Book> books = student.getBook();
		
		for (Book book : books) {
			if(book.getBookId() == bookId) {
				book.setBookPrice(price);
				entityTransaction.begin();
				entityManager.merge(book);
				entityTransaction.commit();
			}
		}
		
		return student;
		
	}
	
	
}
