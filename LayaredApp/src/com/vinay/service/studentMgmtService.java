package com.vinay.service;

import com.vinay.bo.studentBO;
import com.vinay.dao.studentDAO;
import com.vinay.dto.studentDTO;

public class studentMgmtService implements studentMgmtServiceImpl{
	private studentDAO dao;	
	studentBO bo=null;
	int count =0;
	public studentMgmtService() {
		this.dao = dao;
	}
	public String register(studentDTO dto) throws Exception{
		bo=new studentBO();
		bo.setStudentRollNo(dto.getsRollNo());
		bo.setStudentName(dto.getStudentName());
		bo.setStudentEmailId(dto.getsEmailID());
		
		count=dao.insert(bo);
		if(count==0)
			  return "Student Registration failed";
		else
			  return "Student Registration succeded";
		

	}
}
