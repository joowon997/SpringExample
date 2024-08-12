package com.joowon.spring.ex.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.joowon.spring.ex.mybatis.domain.Review;
import com.joowon.spring.ex.mybatis.service.ReviewService;

@Controller
@RequestMapping("/mybatis/review")
public class ReviewController {

	@Autowired
	private ReviewService reviewService;
	
	// 파라미터로 전달받은 id와 일치하는 리뷰 정보를 json으로 response 담는다.
	@RequestMapping("/")
	@ResponseBody
	public Review review(@RequestParam("id") int id) {
		// reqeust Pamameter 
		// reqeust.getPamameter("id");
		
		return reviewService.getReview(id);
	}
	
	// 리뷰 정보를 저장하는 페이지
	@RequestMapping("/create")
	@ResponseBody
	public String createReview(){
		
		// 4, 치즈피자, 정주원, 4.5, 치즈피자 존맛
//		int count = reviewService.addReview(4, "치즈피자", "정주원", 4.5, "치즈피자 존맛!");

		// 2, 뿌링클, 정주원, 4.0, 역시 뿌링클은 진리 입니다.
		Review review = new Review();
		review.setStoreId(2);
		review.setMenu("뿌링클");
		review.setUserName("정주원");
		review.setPoint(4.0);
		review.setReview("역시 뿌링클은 진리 입니다.");
		
		int count = reviewService.addReviewByObject(review);
		
		// 입려개수 : 1
		return "입력개수 : " + count;
	}
}
