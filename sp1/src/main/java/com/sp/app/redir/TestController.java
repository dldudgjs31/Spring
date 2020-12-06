package com.sp.app.redir;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller("redir.testController")
@RequestMapping("/redir/*")
public class TestController {
	
	@GetMapping("main")
	public String main(
			@RequestParam(value = "page", defaultValue = "1" ) int current_page,
			@RequestParam(defaultValue = "all") String col,
			Model model
			) throws Exception{
		model.addAttribute("page", current_page);
		model.addAttribute("col", col);
		return "redir/view";
	}
	
	@GetMapping("insert")
	public String insertSubmit(
			RedirectAttributes rAttr
			) throws Exception{
		String page ="15";
		String col="subject1";
		
		//리다이렉트
//		return"redirect:/redir/main?page="+page+"&col="+col;
		rAttr.addAttribute("page",page);
		rAttr.addAttribute("col",col);
		return"redirect:/redir/main";
		//redirectattributes : 리다이렉트된 주소에 파라미터 넘기기
		//addAttribute(키 값) 으로 등록된 값은 주소 뒤에
		// ?키=값&키=값 형식으로
	}
}
