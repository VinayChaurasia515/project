package com.vinay.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class dateServlet extends GenericServlet {

	public void service(ServletRequest req, ServletResponse res) throws IOException, ServletException {
		Date d = null;
		PrintWriter pw=null;
		
		pw = res.getWriter();
		res.setContentType("text/html");
		// write b.logic
		d = new Date();
		pw.println("<h1>Date Servlet :: Current Date is  ::" + d.toString() + "</h1>");
		// close streem
		pw.close();
	}
}