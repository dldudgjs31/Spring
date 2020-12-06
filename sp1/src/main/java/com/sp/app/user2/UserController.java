package com.sp.app.user2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("user2.userController")
@RequestMapping("/user2/*")
public class UserController {
	@GetMapping("request")
	public String form() throws Exception {
		return "user2/write";
	}
	
	
	
	
	
	/*
	 * @PostMapping("request") public ModelAndView submit(String name, int age,
	 * String hobby) throws Exception{ //동일한 파라미터를 String hobby 처럼 받으면 "값1, 값2" 처럼
	 * 받는다. String s = name +":"+hobby; ModelAndView mav= new
	 * ModelAndView("user2/view"); mav.addObject("msg", s); return mav; }
	 */
	
	
	//배열로 넘겨 받기
	/*
	 * @PostMapping("request") public ModelAndView submit(String name, int age,
	 * String[] hobby) throws Exception{ //이름이 동일한 파라미터를 배열로 받는 방법 String h="";
	 * 
	 * if(hobby!=null) { for(String a : hobby) { h+=a+" "; } } String s =
	 * name+":"+h;
	 * 
	 * 
	 * ModelAndView mav= new ModelAndView("user2/view"); mav.addObject("msg", s);
	 * return mav; }
	 */
	@PostMapping("request")
	public ModelAndView submit(User dto) throws Exception{
		//이름이 동일한 파라미터를 dto 안의 list로 받기
		String h="";
		
		if(dto.getHobby()!=null) {
			for(String a : dto.getHobby()) {
				h+=a+" ";
			}
		}
		String s = "dto의 리스트로 받기"+dto.getName()+":"+h;
		
		
		ModelAndView mav= new ModelAndView("user2/view");
		mav.addObject("msg", s);
		return mav;
	}
}
