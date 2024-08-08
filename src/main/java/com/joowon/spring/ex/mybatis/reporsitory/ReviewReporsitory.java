package com.joowon.spring.ex.mybatis.reporsitory;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.joowon.spring.ex.mybatis.domain.Review;

@Mapper
public interface ReviewReporsitory {
	
	// 전달 받은 id와 일치하는 행 조회
	public Review selectReview(@Param("id") int id);
}
