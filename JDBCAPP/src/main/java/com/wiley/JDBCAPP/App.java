package com.wiley.JDBCAPP;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static java.lang.Class.forName;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try{
            String driver="com.mysql.cj.jdbc.Driver";

            String url= "jdbc:mysql://127.0.0.1:3306/wileyclassic";
            String username="root";
            String password="Password@123";

            Class.forName(driver);

            Connection conn= DriverManager.getConnection(url,username,password);
            System.out.println("connection sucess");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
