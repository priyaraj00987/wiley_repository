package com.wiley.JDBCAPP;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class preparedStatement {
    public static void main(String[] args) {
        try{
            String driver="com.mysql.cj.jdbc.Driver";

            String url= "jdbc:mysql://127.0.0.1:3306/wileyclassic";
            String username="root";
            String password="Password@123";

            Class.forName(driver);

            Connection conn= DriverManager.getConnection(url,username,password);
            String q= "insert into table1(tName,tCity) values(?,?)";

            //get the preparedStatement
            PreparedStatement pstmt= conn.prepareStatement(q);
            pstmt.setString(1,"roy");
            pstmt.setString(2,"pune");
            pstmt.executeUpdate();
            System.out.println("inserted ..............");
            conn.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
