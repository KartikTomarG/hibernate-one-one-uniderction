package com.ansari.hibernate_one_to_many_project.service;

import com.ansari.hibernate_one_to_many_project.dao.StudentDao;
import com.ansari.hibernate_one_to_many_project.dto.Student;

public class StudentService {

	StudentDao dao = new StudentDao();
	
	public Student saveStudent(Student student) {		
		System.out.println("Data inserted");
		return dao.saveStudent(student);
	}

	public Student updateBookPrice(int studentId, double price, int bookId) {
		System.out.println("Data Updated");
		return dao.updateBookPrice(studentId, price, bookId);
	}
	
}
