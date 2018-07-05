package com.spring.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDto userDto = (UserDto)context.getBean("userDto");
		AddressDto addr = (AddressDto)context.getBean("addr");
		System.out.println(userDto.toString());
		System.out.println(userDto.getAddress().toString());	
	}

}
