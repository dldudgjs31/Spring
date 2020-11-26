package com.sp.app.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
//haddler mapping에 해당하는 게 requestmapping
@Controller
@RequestMapping("/first/*")
public class FirstController {
	@Autowired
	private FirstService service;
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="calc", method = RequestMethod.GET)
	public String form() throws Exception {
		return "first/request"; //포워딩할 jsp의 논리적인 이름을 반환한다.
	} 
	/**
	 * 디스패치 서블릿에서 자동으로 first의 dto에 값을 넣어준다.
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="calc", method = RequestMethod.POST)
	public ModelAndView submit(First dto) throws Exception{
		int s = service.calculator(dto);
		
		//ModelAndView : 컨트럴러의 처리 겨로가를 보여줄 뷰와 전달할 값을 저장하는 용도
		//메소드가 String 을 반환해도 내부적으로 ModelAndView 객체를 생성하여 반환한다.
		ModelAndView mav = new ModelAndView("first/result"); //jsp로 보내라는 의미
		
		//request.setattribute 와같은 역할 수행
		mav.addObject("dto",dto);
		mav.addObject("result", s);	
		
		return mav;
	}
}
