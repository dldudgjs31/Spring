package com.sp.app.anno5;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("anno5.userController")
@RequestMapping("/anno5/*")
public class UserController {
	
	
	//@ModelAttribute를 메소드 위에 붙이면 @RequestMapping 보다 먼저 실행
	//@requestMapping 이 적용되지 않은 메소드에서 모델 객체 생성

	@ModelAttribute("subjects")
	public List<String> listSubject(){
		List<String> list = new ArrayList<>();
		list.add("자바");
		list.add("오라클");
		list.add("스프링");
		list.add("오라클");
		list.add("안드로이드");
		return list;
		
	}
	
	@GetMapping("request")
	public String form() throws Exception{
		return "anno5/write";
	}
/*	@PostMapping("request")
	public String submit(User dto, Model model) throws Exception{
		
		model.addAttribute("dto", dto);
		return "anno5/view";
	}
*/
	
	
	
	@PostMapping("request")
	public String submit(@ModelAttribute("dto") User dto) throws Exception{
	//	@ModelAttribute : 
		//메소드의 인자에서 사용하는 경우 
		//form 속성으로 넘어온 model에 맵핑된 파라미터로 지정해주는 역할을 한다.
		return "anno5/view";
	}
}
