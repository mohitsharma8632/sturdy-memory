package com.nan;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

@WebServlet()
public class Updateimg extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
		HttpSession session=request.getSession();  
        String email=(String)session.getAttribute("email");
	
    	int jk=0;
		int result = 0;
		Connection con = null;
		Part part = request.getPart("file");
 int ai=Checkpp.man(email);
 
		if(part != null   ){
			if(ai!=0)
  jk=Deletepp.man(email);
			
			try{
				Class.forName("com.mysql.jdbc.Driver"); 
	            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/upload?useSSL=false","dbuser","user");
	          
			    PreparedStatement ps = con.prepareStatement("insert into pic values(?,?)");
			    InputStream is = part.getInputStream();
			   ps.setString(1, email);
			    ps.setBlob(2, is);
			    result = ps.executeUpdate();
			}
			catch(Exception e){
				e.printStackTrace();
			}	
			finally{
				if(con != null){
					try{
						con.close();
					}
					catch(Exception e){
						e.printStackTrace();
					}
				}
			}
		}
		
		if(result > 0){
	    	response.sendRedirect("done.jsp");
	    }
		else{
			response.sendRedirect("welcome.jsp");
		}

	
	}

}
