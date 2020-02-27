package com.nan;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet()
public class Updatepass extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String a=request.getParameter("oldpass");
		String b=request.getParameter("newpass");
		HttpSession session=request.getSession();  
        String c=(String)session.getAttribute("email");
		int i=PasswordCheck.man(c, a);
		if(i==1) {
			int ij=Passchng.man(c, b);
			if(ij==1)
			response.sendRedirect("done.jsp");
			else
				response.sendRedirect("profilechng.jsp");	
		
		}
		else
			response.sendRedirect("profilechng.jsp");
		
	}

}
