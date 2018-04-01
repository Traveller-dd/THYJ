package com.tianyi.spring.anno;

import org.springframework.stereotype.Service;

@Service("userDao2")
public class UserDao2 {

	public void add() {
		System.out.println("UserDao2 add +++++++");
	}
}
