package com.sp.app.first;

import org.springframework.stereotype.Service;

@Service
public class FirstServiceImpl implements FirstService {

	@Override
	public int calculator(First dto) {
		int result = 0;

		if (dto.getOper().equals("+")) {
			result = dto.getNum1() + dto.getNum2();
		} else if (dto.getOper().equals("-")) {
			result = dto.getNum1() - dto.getNum2();
		} else if (dto.getOper().equals("/")) {
			result = dto.getNum1() / dto.getNum2();
		} else if (dto.getOper().equals("*")) {
			result = dto.getNum1() * dto.getNum2();
		}
		return result;
	}

}
