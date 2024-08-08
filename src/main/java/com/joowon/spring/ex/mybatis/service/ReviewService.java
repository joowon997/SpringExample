package com.joowon.spring.ex.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joowon.spring.ex.mybatis.domain.Review;
import com.joowon.spring.ex.mybatis.reporsitory.ReviewReporsitory;

@Service
public class ReviewService {
	
	@Autowired
	private ReviewReporsitory reviewReporsitory;
	
	// 전달 받은 id와 일치하는 리뷰 정보 리턴 기능
	public Review getReview(int id) {
		// new_review 테이블에서 id와 일치하는 행 조회
		return reviewReporsitory.selectReview(id);
	}
}
