package com.vinay.dto;

import java.io.Serializable;

public class studentDTO implements Serializable {
	private int sRollNo;
	private String studentName;
	private String sEmailID;
	public int getsRollNo() {
		return sRollNo;
	}
	public void setsRollNo(int sRollNo) {
		this.sRollNo = sRollNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getsEmailID() {
		return sEmailID;
	}
	public void setsEmailID(String sEmailID) {
		this.sEmailID = sEmailID;
	}
}
