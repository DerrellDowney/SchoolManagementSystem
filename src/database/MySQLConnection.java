/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author derrelldowney
 */
public class MySQLConnection {
    public static Connection getConnection() throws Exception{
        try{
            
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/studentManagementSystem"; //
            String username = "root";
            String password = "1234"; //insert password
            Class.forName(driver);
            
            Connection conn = DriverManager.getConnection(url,username,password);
            System.out.println("Connected");
            return conn;
        }
        catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
}
