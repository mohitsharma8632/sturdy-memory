package com.nan;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Passchng {



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
            String sql="UPDATE `user` SET    `pass` = '"+pass+"'"+"WHERE `user`.`email` = '"+email+"'";
            
            //    UPDATE `user` SET  `pass` = 'b5c0b187fe309af0f4ddgsgdfb35982fd961d7e' WHERE `user`.`email` = 'aa@a.com'
            Statement ps=conn.createStatement();
            int i=ps.executeUpdate(sql);
            if(i==1) {

                return 1;}
             
          else
                return 0;


        }
        catch (Exception e) {
            e.printStackTrace();
        }
		return 0;


	
	
}}
