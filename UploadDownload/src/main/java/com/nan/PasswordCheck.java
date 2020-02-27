package com.nan;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.sql.*;
import java.util.*;

public class PasswordCheck {




    public static int man(String emil,String password) {
       String email=emil;
        String pass=password;



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
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/upload?useSSL=false","dbuser","user");
            String sql="select * from user where email = '"+email+"'";
            Statement ps=conn.createStatement();
            ResultSet rs=ps.executeQuery(sql);
            if(rs.next()) {

                if(pass.equalsIgnoreCase(rs.getString(5))){
                    return 1;}
                else
                    return 0;
            }else
                return 0;


        }
        catch (Exception e) {
            e.printStackTrace();
        }
		return 0;

    }
}

