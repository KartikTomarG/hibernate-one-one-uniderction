package com.ansari.hibernate_one_to_many_project.controller;

import java.util.Scanner;

import com.ansari.hibernate_one_to_many_project.dto.Student;
import com.ansari.hibernate_one_to_many_project.service.StudentService;

public class StudentController {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Student student = new Student();
		StudentService studentService = new StudentService();
		
		while(true) {
			
			System.out.println("1.Insert Student\n2.Book price update");
			int choice = s.nextInt();
			
			switch (choice) {
				case 1: {
					System.out.print("Enter Student id : ");
					student.setStudentId(s.nextInt());
					System.out.print("Enter Student name : ");
					student.setStudentName(s.next());
					System.out.print("Enter Student email : ");
					student.setStudentEmail(s.next());
					System.out.print("Enter Student Branch : ");
					student.setStudentBranch(s.next());
					
					studentService.saveStudent(student);
				}
				break;
				
				case 2:{
					System.out.print("Enter Book id : ");
					int bookId = s.nextInt();
					
					System.out.print("Enter Student Id : ");
					int studentId = s.nextInt();
					
					System.out.print("Enter Book Price : ");
					double price = s.nextDouble();
					
					studentService.updateBookPrice(studentId, price, bookId);
					
				}
				break;
				
				default:{
					System.out.println("Bye");
					
				}
			}
			
		}
		
	}
	
}
