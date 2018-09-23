package com.wayne.test;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wayne.entity.Department;
import com.wayne.entity.Employee;

public class App1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"com/wayne/test/beans.xml");

		System.out.println("************����װ��bean***************");
		// ����װ��bean
		Department department = (Department) ac.getBean("department");
		System.out.println(department.getName());

		System.out.println("**********����װ��bean************");
		// ����װ��bean
		// ����ȡ������
		for (String empName : department.getEmpName()) {
			System.out.println(empName);
		}

		System.out.println("**************List����װ��bean*************");
		// list����װ��bean
		// ����ȡ��list����,list������װ����Employee
		for (Employee emplist : department.getEmpList()) {
			System.out.println(emplist.getName());
		}

		System.out.println("***********Set����װ��bean**************");
		// Set����װ��bean
		// ����ȡ��Set����,Set������װ����Employee
		for (Employee empSet : department.getEmpSet()) {
			System.out.println(empSet.getName());
		}

		System.out.println("****************Mapװ��bean**************");
		// Map����װ��bean
		// 1.������
		Map<String,Employee> empMap = department.getEmpMap();
		Iterator it = empMap.keySet().iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			Employee emp = empMap.get(key);
			System.out.println("key="+key+"value="+emp.getName());
		}
		// 2.�߼�for
		for (Entry<String, Employee> entry1 : department.getEmpMap().entrySet()) {
			System.out.println("key=" + entry1.getKey() + "value="
					+ entry1.getValue().getName());
		}
		
		System.out.println("****************Propertiesװ��bean**************");
		// Properties����װ��bean(Propertiesʵ��Map�ӿ�)
		Properties pp = department.getPp();
		for (Entry<Object, Object> ps : pp.entrySet()) {
			System.out.println(ps.getKey().toString()+" "+ps.getValue().toString());
		}
	}

}
