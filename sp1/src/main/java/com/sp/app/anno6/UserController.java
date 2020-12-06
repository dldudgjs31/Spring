package com.sp.app.anno6;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller("anno6.userController")
@RequestMapping("/anno6/*")
public class UserController {
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
		return "anno6/write";
	}
	
	@PostMapping("request")
	public String submit(User dto, RedirectAttributes rattr) throws Exception{
		//DB작업 후 리다이렉트
		
//		rattr.addAttribute("키","값"); //값은 문자열만, 주소줄에 꼬리가 붙어서감
		
		//리다이렉트된 페이지에 값을 전달 // 객체도 가능
		//주소줄에 꼬리를 붙여서 넘기기않고 내부적으로 세션 사용
		//단 한번만 사용, 새로고침하면 초기화되어 보내지 않음
		rattr.addFlashAttribute("dto",dto);
		return "redirect:/anno6/show";
	}
/*	
	@GetMapping("show")
	public String result() throws Exception{
		//rattr.addFlashAttribute() 한 값은 jsp에서 el로 바로 사용 가능
		//새로고침하면 사라짐
		return "anno6/view";
	}
	*/
	
	@GetMapping("show")
	public String result(@ModelAttribute("dto") User dto) throws Exception{
		System.out.println(dto.getName() + ":" + dto.getSubject());
		return "anno6/view";
	}
}
