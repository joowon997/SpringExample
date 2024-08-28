package com.joowon.spring.ex.jpa.repositroy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joowon.spring.ex.jpa.domain.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	// 1행을 Insert
	
	
}
