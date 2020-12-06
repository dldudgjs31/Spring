package com.sp.app.anno1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller("anno1.testController")
@RequestMapping("/anno1/*")
public class TestController {
	
	@GetMapping("main")
	public String main() throws Exception {
		return "anno1/main";
	}
	
	@GetMapping("request1")
	public String submit1(int age, String g, Model model) throws Exception{
		String state = "성인";
		if(age<19) state = "미성년자";
		
		String result = "성별:"+g+", "+state;
		
		model.addAttribute("msg", result);
		return "anno1/view";
	}
	
	@GetMapping("request2")
	public String submit2(@RequestParam int age, @RequestParam String g, Model model) throws Exception{
		//age는 파라미터로 넘어오는 값이 없으면 500에러
		//@RequestParam : key=value 형태로 서버로 전달된 파라미터를 메소드의 인수로 지정한다.
		// 필수이며 넘어오는 값이 없으면 400에러 발생
		//일반적으로 get 방식의 파라미터를 전달 받을때 사용
		String state = "성인";
		if(age<19) state = "미성년자";
		
		String result = "성별:"+g+", "+state;
		
		model.addAttribute("msg", result);
		return "anno1/view";
	}
	@GetMapping("request3")
	public String submit3(@RequestParam(value = "age") int a, @RequestParam(defaultValue = "F")  String g, Model model) throws Exception{
		//@RequestParam(defaultValue = "F") : 값이 존재하지 않을시 디폴트 값 설정
		//@RequestParam(value = "age") : 보내는 파라미터이름과 받는 변수명이 다른 경우 파라미터 이름 을 명시
		String state = "성인";
		if(a<19) state = "미성년자";
		
		String result = "성별:"+g+", "+state;
		
		model.addAttribute("msg", result);
		return "anno1/view";
	}
}
