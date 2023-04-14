package com.ansari.hibernate_one_to_many_project.dao;

import java.util.List;

import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ansari.hibernate_one_to_many_project.dto.Book;

public class BookDao {

//	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("kartik");
//	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityManager entityManager = Persistence.createEntityManagerFactory("kartik").createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public Book saveBook(Book book) {
		
		entityTransaction.begin();
		entityManager.persist(book);
		entityTransaction.commit();
		return book;
	
	}
	
	public Book bookGetById(int id) {
		
		Book book = entityManager.find(Book.class, id);
		
		return book;
		
	}
	
	public List<Book> diaplayBook(){
		return entityManager.createQuery("Select B From Book B",Book.class).getResultList();	
	}
	
	
	
}
