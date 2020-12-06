package com.sp.app.anno3;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("anno3.testController")
@RequestMapping("/anno3/*")
public class TestController {
	
	@RequestMapping(value="main", method = RequestMethod.GET)
	public String main() throws Exception {
		return "anno3/main";
	}

	@RequestMapping(value="result", method = RequestMethod.GET)
	public String result(
			@RequestHeader("Accept-Language")String lang,
			@RequestHeader("User-Agent")String agent,
			HttpServletRequest req, 
			Model model) throws Exception{

		String ref=req.getHeader("Referer");
		String s ="클라이언트 언어 : "+lang+"<br>";
		s+="클라이언트 브라우저 종류 및 os : "+agent+"<br>";
		s+="이전클라이언트주소 : "+ref;
		
		model.addAttribute("msg", s);
		
		return "anno3/view";
	}
}
