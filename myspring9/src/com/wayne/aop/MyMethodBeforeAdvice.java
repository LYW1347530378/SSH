package com.wayne.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;


public class MyMethodBeforeAdvice implements MethodBeforeAdvice{
/**
 * method:�����÷���������
 * arg1:��method���ݵĲ���
 * target:Ŀ�����
 */
	@Override
	public void before(Method method, Object[] arg1, Object target)
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("д��־..."+method.getName());
		
	}

}
