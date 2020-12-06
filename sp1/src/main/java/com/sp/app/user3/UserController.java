package com.sp.app.user3;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller("user3.userController")
@RequestMapping("/user3/*")
public class UserController {
	@Autowired
	private UserService service;
	
	@RequestMapping(value="request", method=RequestMethod.GET)
	public String form() throws Exception {
		return "user3/write";
	}
	/*
	 * @RequestMapping(value="request", method=RequestMethod.POST) public String
	 * submit(User dto, Map<String, Object> map) throws Exception { //메소드 파라미터의 MAP:
	 * 포워딩하는 JSP에 값 전달(req.setAttribute() 역할) String s ="메소드 인자 : map -"+
	 * service.grade(dto);
	 * 
	 * map.put("dto", dto); map.put("msg",s);
	 * 
	 * 
	 * return "user3/view"; }
	 */
	
	
	/*
	 * @RequestMapping(value="request", method=RequestMethod.POST) 
	public String submit(User dto, Model model) throws Exception{
		
		// 메소드 파라미터의 model 인터페이스 : 포워딩하는 jsp에 값 전달 (req.setAttribute() 역할)
		String s ="메소드 인자 : model -"+ service.grade(dto);
		model.addAttribute("dto", dto);
		model.addAttribute("msg", s);
		
		return "user3/view";
	}
	*/
	@RequestMapping(value="request", method=RequestMethod.POST)
	public String submit(User dto, HttpServletRequest req, HttpSession session) throws Exception{
		//httpservletrequest. httpsession 추가도 가능
		String s ="메소드 인자 : -"+ service.grade(dto);
		
		req.setAttribute("dto", dto);
		req.setAttribute("msg", s);
		return "user3/view";
	}
}
