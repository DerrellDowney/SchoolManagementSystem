/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginwindow;

import javax.swing.JFrame;

/**
 *
 * @author derrelldowney
 */
public class Logout {
    public static void logOut(JFrame context, LoginForm loginScreen){
        LoginSession.isLoggedIn = false;
        context.setVisible(false);
        loginScreen.setVisible(true);
    }
}
