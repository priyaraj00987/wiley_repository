package com.wiley.JDBCAPP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class update {
    public static void main(String[] args) {
        try{
            String driver="com.mysql.cj.jdbc.Driver";

            String url= "jdbc:mysql://127.0.0.1:3306/wileyclassic";
            String username="root";
            String password="Password@123";

            Class.forName(driver);

            Connection conn= DriverManager.getConnection(url,username,password);
            String q= "update table1 set tName=?,tCity=? where tid=?";

            //get the preparedStatement
            PreparedStatement pstmt= conn.prepareStatement(q);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter name");
            String name= br.readLine();

            System.out.println("enter city ");
            String city= br.readLine();
            System.out.println("enter student id....");
            int id= Integer.parseInt(br.readLine());
            pstmt.setString(1,name);
            pstmt.setString(2,city);
            pstmt.setInt(3,id);
            pstmt.executeUpdate();
            System.out.println("inserted ..............");
            conn.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
