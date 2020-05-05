package com.jt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jt.pojo.User;
@RestController
@PropertySource("classpath:/properties/preson.properties")
public class PresonController {
	
	//向spring容器中获取数据
	@Value("${person.id}")
	private Integer id;
	@Value("${person.name}")
	private String name;
	
	@RequestMapping("/getPerson")
	public String getMsg() {
		
		return id+":"+name;
	}
	
	public void user() {
		User user = new User();
		user.setId(100)
		    .setName("xxdsdf");
		
	}
	
	
	
	
}
