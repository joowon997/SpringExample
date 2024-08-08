package com.joowon.spring.ex.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.joowon.spring.ex.mybatis.domain.Review;
import com.joowon.spring.ex.mybatis.service.ReviewService;

@Controller
public class ReviewController {

	@Autowired
	private ReviewService reviewService;
	
	// 파라미터로 전달받은 id와 일치하는 리뷰 정보를 json으로 response 담는다.
	@RequestMapping("/mybatis/review")
	@ResponseBody
	public Review review(@RequestParam("id") int id) {
		// reqeust Pamameter 
		// reqeust.getPamameter("id");
		
		
		return reviewService.getReview(id);
	}
}
