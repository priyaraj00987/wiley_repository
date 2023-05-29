package com.wiley.JDBCAPP;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class select {
    public static void main(String[] args) {
        try {
            String driver = "com.mysql.cj.jdbc.Driver";

            String url = "jdbc:mysql://127.0.0.1:3306/wileyclassic";
            String username = "root";
            String password = "Password@123";

            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, password);
            String q = "select * from table1";
            Statement stmt= conn.createStatement();
            ResultSet set= stmt.executeQuery(q);
            while(set.next()){
                int id= set.getInt(1);
                String name= set.getString(2);
                String city= set.getString(3);
                System.out.println(id +"  " + name+"  "+ city);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}