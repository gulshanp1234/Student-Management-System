package com.studentManagemt.service;

import java.util.List;

import com.studentManagemt.entity.Student;

public interface StudentService {
	
	List<Student> getAllStudents();

	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudent(Long id);
}