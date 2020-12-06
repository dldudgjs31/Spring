package com.sp.app.test1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//컨트롤러를 나타낸다. 
//실질적으로 요청을 처리하는 실질적인 클래스
@Controller//=> 서블릿 개념 : 사용자의 모든 요청을 받는다.
@RequestMapping({"/test1/*", "/test3/*"}) //배열처리로 매핑처리 가능
public class TestController {
	
	//URL에 대한 요청이 들어온 경우 해당 클래스 또는 메소드에 매핑
	@RequestMapping("hello") // GET 방식과 POST 방식 모두 처리
	public String execute() throws Exception{
		// 리턴타입이 String은 뷰의 논리적 이름
		return "test1/main";
	}
	
	//GET 요청만 처리
	@RequestMapping(value="hello2", method = RequestMethod.GET)
	public ModelAndView execute2(int age) throws Exception{
		String state = age>=19? "성인" :"미성년자";
		
		//컨트롤러의 처리 결과를 보여줄 뷰와 전달할 값을 저장하는 용도
		//메소드가 String을 반환해도 내부적으로 ModelAndView 객체를 생성하여
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/test1/view2"); // 뷰의 논리적 이름 (view name)
		mav.addObject("state",state); // request.setAttribute("state", state); 기능 수행
		
		return mav;
	}
	
	
	@RequestMapping(value="hello3", method = RequestMethod.GET)
	public String form() throws Exception{
		return "test1/write";
		
	}
	
	@RequestMapping(value="hello3", method = RequestMethod.POST)
	public ModelAndView submit(String name , int age) throws Exception{
		String s = age>=19?"성인":"미성년자";
		String result="나이 : " + age + ", "+s;
		ModelAndView mav = new ModelAndView("test1/result");
		mav.addObject("name",name);
		mav.addObject("result", result);
		
		return mav;
	}
}
