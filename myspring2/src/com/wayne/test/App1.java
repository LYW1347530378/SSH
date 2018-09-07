package com.wayne.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wayne.inter.ChangeLetter;
import com.wayne.letter.UpperLetter;

public class App1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//applicationContext.xml������һ��д��
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/wayne/test/beans.xml");
	
		//���ýӿڽ��д�Сдת��
//		UpperLetter upperLetter = (UpperLetter) ac.getBean("upperLetter");
//		System.out.println(upperLetter.change());
		
		//�ýӿڵķ���ʵ�ִ�Сдת��
		//�ص�:�ӿ������໥ת��
		//ͨ��ע��beans.xml�ļ��е�beanʵ�ִ�д/Сдת��
		ChangeLetter changeLetter = (ChangeLetter) ac.getBean("changeLetter");
		System.out.println(changeLetter.change());
	}

}
