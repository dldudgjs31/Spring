package com.sp.app.insa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("insa.insaController")
@RequestMapping("/insa/*")
public class InsaController {
	@Autowired
	private InsaService service;
	
	@RequestMapping(value="request", method=RequestMethod.GET)
	public String form() {
		return "insa/write"; 
	}

	@RequestMapping(value="request", method=RequestMethod.POST)
	public String submit(Insa dto, Model model) {
		service.calculator(dto);
		
		model.addAttribute("dto", dto);
		
		return "insa/view"; 
	}
	
}
