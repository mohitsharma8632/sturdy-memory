package com.nan;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Checkpp {




    public static int man(String emil) {
       String email=emil;
     










        try {
        	Class.forName("com.mysql.jdbc.Driver"); 
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/upload?useSSL=false","dbuser","user");
            String sql="select * from pic where email = '"+email+"'";
            Statement ps=conn.createStatement();
            ResultSet rs=ps.executeQuery(sql);
            if(rs.next()) {

                 return 1;}
           else
                return 0;


        }
        catch (Exception e) {
            e.printStackTrace();
        }
		return 0;


}
}