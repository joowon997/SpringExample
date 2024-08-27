package com.joowon.spring.ex.jpa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.joowon.spring.ex.jpa.domain.Student;

@Controller
public class StudentController {

	// C, U, D
	public  createStudent() {
		// 정주원, 010-1234-5678, jung@naver.com, 개발자
		
	}
	
	
	@GetMapping("/jpa/lombok/test")
	@ResponseBody
	public Student lombokTest(){
		
//		Student student = new Student(10, "정주원", "010-1111-2222", "jung@naver.com", "프로그래머", null, null);
//		student.setPhoneNumber("010-9999-0000");
		
		Student student = Student.builder()
					.name("정주원")
					.phoneNumber("010-0000-1111")
					.email("jung@naver.com")
					.dreamJob("프로그래머")
					.build();
		
		return student;
	}
	
	
}
