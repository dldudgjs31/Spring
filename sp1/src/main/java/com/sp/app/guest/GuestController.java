package com.sp.app.guest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("guestController")
@RequestMapping("/guest/*")
public class GuestController {
	
	@RequestMapping("main")
	public String guest() throws Exception {
		return ".guest.guest";
	}
	
}
