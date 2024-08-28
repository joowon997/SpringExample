package com.joowon.spring.ex.jpa.repositroy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joowon.spring.ex.jpa.domain.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	// 1행을 Insert
	
	// id(PK)를 기반으로 하나의 행을 조회하는 기능
	
	
	
}
