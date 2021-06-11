package com.vinay.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vinay.dto.studentDTO;
import com.vinay.service.studentMgmtService;
import com.vinay.service.studentMgmtServiceImpl;
import com.vinay.vo.studentVO;

@WebServlet("/controller")
public class studentControllerServlet  extends HttpServlet {
	   private studentMgmtServiceImpl service=new studentMgmtService();
	

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw=null;
		studentVO vo=null;
		studentDTO dto=null;
		String result=null;
	   //get PrintWriter
		pw=res.getWriter();
		//set response content type
		res.setContentType("text/html");
		//read form data ... and store VO class object
		vo=new studentVO();
	
		vo.setsRollNo(req.getParameter("roll"));
		vo.setStudentName(req.getParameter("name"));
		vo.setsEmailID(req.getParameter("email"));
		
		//convert VO to DTO
		dto=new studentDTO();
		dto.setsRollNo(Integer.parseInt(vo.getsRollNo()));
		dto.setStudentName(vo.getStudentName());
		dto.setsEmailID(vo.getsEmailID());
		
		//use service
		try {
			result=service.register(dto);
			pw.println("<h1 style='color:green;text-align:center'>"+result+"</h1>");
		}//try
		catch(Exception e) {
			e.printStackTrace();
			pw.println("<h1 style='color:red;text-align:center'>Internal Problem --Try Again </h1>");
		}
		//add hyperlink
		pw.println("<br><br><a href='student_register.html'>home </a>");
		//close stream
		pw.close();
		
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}

}
