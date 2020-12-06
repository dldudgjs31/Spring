package com.sp.app.test3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller("test3.testController")
@RequestMapping("/test3/*")
public class TestController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String main() throws Exception {
		return "test3/view";
	}
	
	@RequestMapping(value ="state")
	//@RequestMapping(value ="state", method = {RequestMethod.GET, RequestMethod.POST})
	//Integer은 null을 가질수 있다  : int형은 null을 가질수 없어서 실행전에 에러발생
	public ModelAndView request(Integer age) throws Exception {
		ModelAndView mav = new ModelAndView("test3/state"); // 포워딩
		try {
			String s = age>=19?"성인":"미성년자";
			mav.addObject("state",s);
			
		} catch (Exception e) {
			//리다이렉트 : "redirect:/" 부분이 추가되면 리다이렉트
			return new ModelAndView("redirect:/test3/error");
		}
		return mav;
	}
	
	@GetMapping("error")
	public String error() throws Exception{
		return "test3/error";
	}

}
