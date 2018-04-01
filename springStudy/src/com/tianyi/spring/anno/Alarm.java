package com.tianyi.spring.anno;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service(value = "alarm")
@Scope(value = "prototype")
public class Alarm {

	public void SendAlarm(){
		System.out.println("sendAlarm ------------");
	}
}
