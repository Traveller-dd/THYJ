package com.tianyi.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tianyi.spring.anno.Alarm;
import com.tianyi.spring.anno.User;
import com.tianyi.spring.anno.UserService;

public class AnnoTest {

	ApplicationContext context = new ClassPathXmlApplicationContext("config/applicationContext-anno.xml");
	@Test
	public void test1() {
		User user1 = (User) context.getBean("user");
		System.out.println(user1);
		user1.add();
		User user2 = (User) context.getBean("user");
		System.out.println(user2);
	}
	
	@Test
	public void test2(){
		Alarm alarm1 = (Alarm)context.getBean("alarm");
		System.out.println(alarm1);
		alarm1.SendAlarm();
		Alarm alarm2 = (Alarm)context.getBean("alarm");
		System.out.println(alarm2);
	}
	
	@Test
	public void test3(){
		UserService userService = (UserService)context.getBean("userService");
		System.out.println(userService);
		userService.add();

	}
}
