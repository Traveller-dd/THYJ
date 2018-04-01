package com.tianyi.spring.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("userService")
public class UserService {

	/**
	 * 1、自动注入对象，不需要set方法； 2、与注入对象名字无关，根据类型找对象
	 */
	@Autowired
	private UserDao userDao;
	
	/*@Resource
	private UserDao2 userDao2;*/

	public void add() {
		System.out.println("Service^^^^^^^^");
		userDao.add();
	}
}
