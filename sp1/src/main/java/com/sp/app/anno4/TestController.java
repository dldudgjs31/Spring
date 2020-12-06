package com.sp.app.anno4;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("anno4.testController")
@RequestMapping("/anno4/*")
public class TestController {
	
	@GetMapping("main")
	public String main() throws Exception{
		return "anno4/main";
	}
	
	@GetMapping("set")
	public String setting(HttpServletResponse resp) throws Exception{
		//쿠키 저장
		Cookie ck1 = new Cookie("subject","java");
		resp.addCookie(ck1);
		Cookie ck2 = new Cookie("city","seoul");
		resp.addCookie(ck2);
		
		return "anno4/set";
	}
	
	@GetMapping("get1")
	public String result1(
			@CookieValue(value="subject", required = false) String s 
			, @CookieValue(value="city", defaultValue = "") String c
			,Model model) throws Exception{
		
		//@CookieValue : 쿠키값을 메소드의 인수로 전달받음
		//필수 파라미터로 해당 쿠키가 없으면 500 에러 발생
		//required = false는 쿠키가 없으면 null
		//defaultValue : 쿠키가 없으면 기본 값
		//value : 쿠키 이름 , 생략하면 메소드 인수명이 쿠키 이름
		String result = "<p>쿠키내용</p>";
		result+="<p>subject:"+s+"</p>";
		result+="<p>city: "+c+ "</p>";
		
		model.addAttribute("msg", result);
		
		return "anno4/view";
	}
	
	@RequestMapping(value = "get2", method = RequestMethod.GET)
	public String result2(
			HttpServletRequest req,
			Model model
			) throws Exception{
		
		String result="<p>쿠키내용 </p>";
		String name , value;
		Cookie []ck = req.getCookies();
		for(Cookie c : ck) {
			name = c.getName();
			value = c.getValue();
			result+="<p>"+name+":"+value+"</p>";
		}
		model.addAttribute("msg",result);
		
		return "anno4/view";
	}
}
