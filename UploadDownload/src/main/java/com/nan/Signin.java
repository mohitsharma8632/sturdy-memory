package com.nan;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet()
public class Signin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String a=request.getParameter("email");
	String b=request.getParameter("pass");
	System.out.println(a);
	System.out.println(b);
	int i=PasswordCheck.man(a, b);
	System.out.println(i);
	if(i==1) {
		HttpSession session=request.getSession();  
        session.setAttribute("email",a);  
  
		
		response.sendRedirect("welcome.jsp");  }
	else 
		response.sendRedirect("index.jsp");
	}
	
}