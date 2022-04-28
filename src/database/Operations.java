/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import database.MySQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLOutput;
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
        // need to have something which gets the uid of the last person in the users table
        // and add one which will be the uid of the new account
        try{
            Connection myConn = MySQLConnection.getConnection();
            
            int newUID;
            
            String query1 = "SELECT COUNT(*) from users;";
            PreparedStatement statement1 = myConn.prepareStatement(query1);
            ResultSet resultat =statement1.executeQuery();
            if(resultat.next()){
                newUID = resultat.getInt("COUNT(*)")+1;
                String query2 = "INSERT INTO studentManagementSystem.users "
                    + "(uid, username, password, usertype, firstname, lastname)"
                    + "VALUES ('"+newUID+"', '"+username+"', '"+password+"', '"+usertype+"', '"+firstname+"', '"+lastname+"')";
                PreparedStatement statement2 = myConn.prepareStatement(query2);
                statement2.execute();
            }
            
           
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(frame, "Error: " + e.getMessage());
        }
    }
}
