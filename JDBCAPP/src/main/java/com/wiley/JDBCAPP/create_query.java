package com.wiley.JDBCAPP;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class create_query {
    public static void main(String[] args) {
        try{
            String driver="com.mysql.cj.jdbc.Driver";

            String url= "jdbc:mysql://127.0.0.1:3306/wileyclassic";
            String username="root";
            String password="Password@123";

            Class.forName(driver);

            Connection conn= DriverManager.getConnection(url,username,password);
// create query
            String q= "create table table1(tid int(10) primary key auto_increment , tName varchar(200) not null, tCity varchar(400))";
            //create stamenet
            Statement stmt= conn.createStatement();
            stmt.executeUpdate(q);
            System.out.println("table created");
            conn.close();



        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
