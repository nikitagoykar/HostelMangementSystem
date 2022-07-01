package com.hinernate.com;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Student7

{
	@Id
	private int studentId;

	@Column(length = 30, nullable = false)
	private String studentName;

	@Column(length = 30, nullable = false)
	private String studentemailId;

	@Column(length = 30, nullable = false)
	private String studentContact;

	public Student7(int studentId, String studentName, String studentemailId, String studentContact) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentemailId = studentemailId;
		this.studentContact = studentContact;
	}

	@Override
	public String toString() {
		return "Student7 [studentId=" + studentId + ", studentName=" + studentName + ", studentemailId="
				+ studentemailId + ", studentContact=" + studentContact + "]";
	}

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

	public String getStudentemailId() {
		return studentemailId;
	}

	public void setStudentemailId(String studentemailId) {
		this.studentemailId = studentemailId;
	}

	public String getStudentContact() {
		return studentContact;
	}

	public void setStudentContact(String studentContact) {
		this.studentContact = studentContact;
	}
	

	public Student7() {
		super();
		
	}

}
