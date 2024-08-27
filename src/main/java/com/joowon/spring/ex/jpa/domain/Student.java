package com.joowon.spring.ex.jpa.domain;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Builder
public class Student {

	private int id;
	private String name;
	private String phoneNumber;
	private String email;
	private String dreamJob;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	
}
