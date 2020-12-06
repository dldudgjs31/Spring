package com.sp.app.bbs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("bbs.boardController")
@RequestMapping("/bbs/*")
public class BoardController {
	@RequestMapping("list")
	public String list() throws Exception{
		return ".bbs.list";
	}
}
