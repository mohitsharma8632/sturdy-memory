package com.nan;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.sql.*;
import java.util.*;


public class SignUserUp {





    public static int man(String Name,String Lname,String Email,String Mobileno,String Password) {
       String name=Name;
       String lname=Lname;
       String email=Email;
       String mobileno=Mobileno;
    	
        String pass=Password;



        try {
            MessageDigest messageDigest=MessageDigest.getInstance("MD5");
            byte[] n=messageDigest.digest(pass.getBytes());
            BigInteger b=new BigInteger(1,n);
            String ac=b.toString(16);
            while (ac.length() < 32) {
                ac = "0" + ac;
            }
            pass=ac;
        } catch (Exception e) {
            e.printStackTrace();
        }












        try {
        	Class.forName("com.mysql.jdbc.Driver"); 
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/upload","dbuser","user");
        String sql=   "INSERT INTO user  VALUES (?,?,?,?,?)";  
            
         PreparedStatement ps=conn.prepareStatement(sql);
         ps.setString(1, name);
         ps.setString(2, lname);
         ps.setString(3, email);
         ps.setString(4, mobileno);
         ps.setString(5, pass);
         int a=ps.executeUpdate(); 
         
       if(a>0) {

                 return 1; 
                 }
               else
                return 0;


        }
        catch (Exception e) {
            e.printStackTrace();
        }
		return 0;

    }
}

