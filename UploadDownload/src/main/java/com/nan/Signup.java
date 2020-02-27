package com.nan;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet()
public class Signup extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   String name=request.getParameter("name");
	       String lname=request.getParameter("lname");
	       String mobileno=request.getParameter("mobileno");
	    	String email=request.getParameter("email");
	        String pass=request.getParameter("pass");
	        System.out.println(name);
	        System.out.println(lname);
	        System.out.println(email);
	        System.out.println(mobileno);
	        System.out.println(pass);
	int a=SignUserUp.man(name, lname, email,mobileno, pass);
	if(a==1) {
		HttpSession session=request.getSession();  
        session.setAttribute("email",email);  
		response.sendRedirect("welcome.jsp");
	}else
		response.sendRedirect("index.jsp");
		
	}
}
