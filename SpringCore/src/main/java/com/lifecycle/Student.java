package com.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//public  class Student implements InitializingBean,DisposableBean {
public class Student{
	private int studentId;
	private String studentName;
	private String studentEmail;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentEmail=" + studentEmail
				+ "]";
	}
	
	/*public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
	}
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}*/
	@PostConstruct
	public void start()
	{
		System.out.println("bean is created and start");
	}
	@PreDestroy
	public void end() 
	{
		System.out.println("bean is destroy");
	}
	
	
	
	
}
