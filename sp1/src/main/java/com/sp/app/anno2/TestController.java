package com.sp.app.anno2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller("anno2.testController")
@RequestMapping("/anno2/*")
public class TestController {
	
	@GetMapping("request")
	public String form() throws Exception {
		return "anno2/write";
	}
	
/*	@PostMapping("request")
	public String submit(@RequestParam String name,@RequestParam String city,@RequestParam(defaultValue = "") List<String> hobby,Model model) throws Exception {
		// 이름이 동일한 파라미터를 list 로 넘겨 받기 위해서는 @RequestParam 어노테이션이 필요하다.
		String s= name+":"+city+":";
		for(String h : hobby) {
			s+=h+" ";
		}
		model.addAttribute("msg", s);
		
		return "anno2/view";
	}
*/
	@PostMapping("request")
	public String submit(@RequestParam HashMap<String, String> param,@RequestParam(defaultValue = "") List<String> hobby, Model model) throws Exception{
		//파라미터를  Map으로 넘겨 받기 위해서는 @RequestParam이 필요
		// 파라미터 이름이 동일한 것은 하나만 받을 수 있다.
		
		String name = param.get("name");
		String city = param.get("city");
		
		String s = name+" : "+city+" : "+hobby;
		model.addAttribute("msg", s);
		return "anno2/view";
	}
}
