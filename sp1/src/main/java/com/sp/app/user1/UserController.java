package com.sp.app.user1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller("user1.userController")
@RequestMapping("/user1/*")
public class UserController {
	@Autowired
	private UserService service;
	
	@RequestMapping(value="request", method = RequestMethod.GET)
	public String form() throws Exception {
		return "user1/write";
	}
	/*
	 * @RequestMapping(value="request", method = RequestMethod.POST) 
	 * public ModelAndView submit(String name, String subject, int score) throws Exception
	 * { 
	 * //클라이언트의 요청 정보(파라미터) 받기 : 메소드의 파라미터 = 일반변수로 받기
	 * (주의 : <input> 태그등의 name 속성과 일치해야한다.) 
	 * // 잘사용하지 않는 방식 
	 * // 본 자료형은 넘어오는 파라미터가 없으면 500에러(null은 기본형에 대입 불가)(int)
	 * // String, Integer은 넘어오는 값이 없으면 null
	 * 
	 * User dto = new User(); dto.setName(name); dto.setSubject(subject);
	 * dto.setScore(score);
	 * 
	 * String s = service.grade(dto);
	 * 
	 * ModelAndView mav = new ModelAndView("user1/view"); mav.addObject("dto", dto);
	 * //request.setAttribute("이름",값)과 동일 mav.addObject("msg", s);
	 * 
	 * return mav; }
	 */
	
	@RequestMapping(value="request", method = RequestMethod.POST)
	public ModelAndView submit(User dto) throws Exception{
		//dto로 파라미터 받기
		//<input> 태그등의 name 속성과 dto 의 필드명이 동일한 것만 파라미터를 받는다.
		// <input> 태그등의 name은 반드시 소문자로 시작해야한다.(절대적)
		String s= service.grade(dto);
		ModelAndView mav = new ModelAndView("user1/view");
		mav.addObject("dto", dto); //request.setAttribute("이름",값)과 동일
		mav.addObject("msg", s);
		
		return mav;
	}
}
