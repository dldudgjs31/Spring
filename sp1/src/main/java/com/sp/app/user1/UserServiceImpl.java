package com.sp.app.user1;

import org.springframework.stereotype.Service;

@Service("user1.userService")
public class UserServiceImpl implements UserService {

	@Override
	public String grade(User dto) {
		String s;
		
		if(dto.getScore()>=80) {
			s="우수";
			
		}else if(dto.getScore()>=60) {
			s="보통";
		}else {
			s="노력";
		}
		return s;
	}

}
