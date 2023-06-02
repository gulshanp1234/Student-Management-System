package com.studentManagemt;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.studentManagemt.repository.StudentRepository;

@SpringBootTest
class StudentManagementSystemApplicationTests {
	
	@Autowired
	private StudentRepository studentRepository;

	@Test
	void contextLoads() {
	}
	
	@Test
	public void studentRepoTest() {
		String className = this.studentRepository.getClass().getName();
		String packageName = this.studentRepository.getClass().getPackageName();
		
		System.out.println(className);
		System.out.println(packageName);
	}

}
