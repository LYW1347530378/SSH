package com.wayne.forms;

import org.apache.struts.action.ActionForm;

public class UserForm extends ActionForm{
	//��������[�����һ���淶���������Ƕ����������ֵ�ʱ��]
	//Ӧ�ú�jspҳ��Ŀؼ�����һ����������������ʣ�˵�������������ǲ���һ���Ϳؼ���һ����
	//ֻҪ��֤set��get�����Ϳؼ���������һ������
	
	/*private String name;
	private String pass;
	public String getUsername() {
		return name;
	}
	public void setUsername(String username) {
		this.name = username;
	}
	public String getPassword() {
		return pass;
	}
	public void setPassword(String password) {
		this.pass = password;
	}*/
	
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
} 
