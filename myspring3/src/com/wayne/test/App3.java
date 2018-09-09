package com.wayne.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.wayne.entity.Student;

public class App3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//��applicationContext��ȡ��bean
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/wayne/test/beans.xml");
		//������ȥʵ����beans.xml�����ļ������õ�bean��ʵ��������bean scope=singleton
		//ͨ��spring������ø�beanʱ���Ƿ���Ψһ��ʵ��
		//��bean��ȡ��student
		Student s1 = (Student) ac.getBean("student");
		Student s2 = (Student) ac.getBean("student");
		//����s1��s2���ͬһ��ַ
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		
		//�� scope=prototype�� ÿ�λ��bean��������һ���µĶ���
//		Student s3 = (Student) ac.getBean("student");
//		Student s4 = (Student) ac.getBean("student");
//		//����s3��s4���ͬһ��ַ
//		System.out.println("s1="+s1);
//		System.out.println("s2="+s2);
		
		
		
		//ͨ���ļ�·������ȡ
//		ApplicationContext ac = new FileSystemXmlApplicationContext("D:\\myec ws\\myspring3\\src\\com\\wayne\\test\\beans.xml");
//		Student s3 = (Student) ac.getBean("student");
		
		
		//�������ʹ��beanfactoryȥ��ȡbean,����ֻ��ʵ��������������ô
		//������bean���ᱻ����ʵ����(�ӳ�)��ֻ�е���ȥʹ��getBean���ĳ��beanʱ���Ż�ʵʱ�Ĵ�������bean����Ӧ�Ķ���
//		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/wayne/test/beans.xml"));
//		factory.getBean("student");
		
		
	}

}
