package com.wiley.JDBCAPP;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class inserting_images {
    public static void main(String[] args) {
        try{
            String driver="com.mysql.cj.jdbc.Driver";

            String url= "jdbc:mysql://127.0.0.1:3306/wileyclassic";
            String username="root";
            String password="Password@123";

            Class.forName(driver);

            Connection conn= DriverManager.getConnection(url,username,password);

            String q= "insert into images(pic) value(?)";
            PreparedStatement pstmt= conn.prepareStatement(q);
            FileInputStream fis=new FileInputStream("pancard.jpg");
            pstmt.setBinaryStream(1,fis,fis.available());
            pstmt.executeUpdate();
            System.out.println("done..............");
        }catch (Exception e){
            System.out.println("error");
        }
    }
}
