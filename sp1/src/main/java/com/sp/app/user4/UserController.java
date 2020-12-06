package com.sp.app.user4;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller("user4.userController")
@RequestMapping("/user4/*")
public class UserController {
	@Autowired
	private UserService service;
	
	@RequestMapping(value="request", method=RequestMethod.GET)
	public String form() throws Exception {
		return "user4/write";
	}
/*
	@RequestMapping(value="view", method=RequestMethod.POST)
	public void submit(User dto, Model model) throws Exception{
		//리턴타입이 void인 경우 뷰의 이름은   "/user3/view"의 url 중 user3/view로 결정한다.
		String s= service.grade(dto);
		String result = "<p>리턴타입: void</p>"+dto.getName()+":"+s;
		
		model.addAttribute("msg", result);
		
	}
	*/
/*	
	@RequestMapping(value="view", method=RequestMethod.POST)
	public Map<String, Object> submit(User dto) throws Exception{
		String s= service.grade(dto);
		String result = "<p>리턴타입: Map</p>"+dto.getName()+":"+s;
		
		Map<String, Object> map = new HashMap<>();
		map.put("msg", result);
		
		return map;
		
	}
*/
/*	
	@RequestMapping(value="view", method=RequestMethod.POST)
	public Model submit(User dto) throws Exception{
		String s= service.grade(dto);
		String result = "<p>리턴타입: Model</p>"+dto.getName()+":"+s;
		
		Model model = new ExtendedModelMap();
		model.addAttribute("msg",result); //포워딩jsp에 값 전달
		return model;
		
	}
*/
	@RequestMapping(value="view", method = RequestMethod.POST)
	public void submit(User dto, HttpServletResponse resp) throws Exception {
		String s = service.grade(dto);
		String result = dto.getName()+":"+s;
		
		//직접 결과를 클라이언트에게 전송
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html;charset=utf-8");
		out.print("<html><body>");
		out.print(result);
		out.print("</html></body>");
	}
}
