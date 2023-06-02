package com.studentManagemt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentManagemt.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
