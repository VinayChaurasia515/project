package com.vinay.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.vinay.bo.studentBO;

public class studentDAO implements studentDAOImpl {
	private static final String query="INSERT INTO STUDENT_LAYER_APPLICATION VALUES(SNO_SEQ1.NEXTVAL,?,?,?)";
	PreparedStatement ps=null;
	Connection con=null;
	int count =0;
	
	public int insert(studentBO bo) throws Exception{
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "root");
		if(con!=null)
			ps=con.prepareStatement(query);
		ps.setInt(1, bo.getStudentID());
		ps.setLong(2, bo.getStudentRollNo());
		ps.setString(3, bo.getStudentName());
		ps.setString(4, bo.getStudentEmailId());
		
		count = ps.executeUpdate();
		return count;		
	}
}
