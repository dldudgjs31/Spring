package com.sp.app.test2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("test2.testController") //빈의 이름이 동일하면 서버가 실행되지 않음
@RequestMapping("/test2/main")
public class TestController {
	
	//경로를 작성하지 않으면 위에 해놓은경로로 해당이됨
	@RequestMapping(method = RequestMethod.POST)
	public String execute() {
		return "test2/view";
	}
}
