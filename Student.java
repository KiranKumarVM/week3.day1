package org.student;
//Assignment2:
//=============
//     Package   :org.college
//     Class     :College
//     Methods   :collegeName(),collegeCode(),collegeRank()
//
//     Package   :org.department
//     Class        :Department
//     Methods   :deptName()
// 
//     Package   :org.student
//     Class        :Student
//     Methods   :studentName(),studentDept(),studentId()
//  
//Description:
//create above 3 class and call all your class methods into the Student using multilevel inheritance.

import org.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("Ram Joseph Khan");
	}
	
	public void studentDept() {
		System.out.println("ECE");
	}
	
	public void studentId() {
		System.out.println("11090");
		
	}
	public static void main(String[] args) {
		
		Student student= new Student();
		
		student.collegeName();
		student.collegeCode();;
		student.collegeRank();
		
		student.deptName();
		
		student.studentName();
		student.studentDept();
		student.studentId();

	}

}
