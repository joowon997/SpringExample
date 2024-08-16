package com.joowon.spring.ex.thymeleaf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafController {
	
	@GetMapping("/thymeleaf/ex01")
	public String ex01() {
		return "thymeleaf/ex01";
	}

	@GetMapping("/thymeleaf/ex02")
	public String ex02(Model model) {
		
		// 과일 이름 리스트
		List<String> fruitList = new ArrayList<>();
		
		fruitList.add("사과");
		fruitList.add("귤");
		fruitList.add("바나나");
		
		model.addAttribute("furitList", fruitList);
		
		// "name":정주원, "age":26, "hobby":독서
		// "name":콩이, "age":8, "hobby":공놀이

		List<Map<String, Object>> userList = new ArrayList<>();
		
		Map<String, Object> userMap = new HashMap<>();
		userMap.put("name", "정주원");
		userMap.put("age", 26);
		userMap.put("hobby", "독서");
		
		userList.add(userMap);

		userMap = new HashMap<>();
		userMap.put("name", "콩이");
		userMap.put("age", 8);
		userMap.put("hobby", "공놀이");
		
		userList.add(userMap);

		model.addAttribute("userList", userList);
		
		return "thymeleaf/ex02";
	}
}
