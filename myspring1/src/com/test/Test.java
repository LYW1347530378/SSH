package com.test;

import com.service.UserService;
import com.utils.ApplicationContextUtil;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//��ͳ����-����userService��sayHello()
//		UserService userService = new UserService();
//		userService.setName("lisan");
//		userService.sayHello();
		
		//Spring�����������
		//1.�õ�spring��applicationContext����(��������)
//		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		UserService us = (UserService) ac.getBean("userService");
//		us.sayHello();
		
		//2.ʹ�ý�applicationContext�����װ�õĹ�����
		((UserService)ApplicationContextUtil.getApplicationContext().getBean("userService")).sayHello();
	}

}
