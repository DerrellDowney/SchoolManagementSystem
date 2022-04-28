/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import database.MySQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import loginwindow.LoginSession;

/**
 *
 * @author derrelldowney
 */
public class Operations {
    public static boolean isLogin(String username, String password, String usertype, JFrame frame){
        try{
            Connection myConn = MySQLConnection.getConnection();
            String query = "SELECT uid, usertype, firstname, lastname FROM users "
                    + "WHERE username = '" + username+"' "
                    + "AND password = '" +password+"' "
                    + "AND usertype = '" + usertype+"'";
            PreparedStatement statement = myConn.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                LoginSession.uid = resultSet.getInt("uid");
                LoginSession.usertype = resultSet.getString("usertype");
                LoginSession.firstname = resultSet.getString("firstname");
                LoginSession.lastname = resultSet.getString("lastname");
                
                return true;
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(frame, "Error: " + e.getMessage());
        }
        return false;
    }
    public static void addAccount(String firstname, String lastname, String username, String password, String usertype, JFrame frame){
        try{
            Connection myConn = MySQLConnection.getConnection();
            String query = "INSERT INTO studentManagementSystem.users "
                    + "(uid, username, password, usertype, firstname, lastname)"
                    + "VALUES (001, '"+username+"', '"+password+"', '"+usertype+"', '"+firstname+"', '"+lastname+"')";
            PreparedStatement statement = myConn.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(frame, "Error: " + e.getMessage());
        }
    }
}
