package com.tianyi.spring.anno;

import org.springframework.stereotype.Service;

@Service("userDao")
public class UserDao {
	public void add() {
		System.out.println("Dao ^^^^^^");
	}
}
