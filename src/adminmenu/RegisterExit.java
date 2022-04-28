/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adminmenu;

import dashboard.AdminDashboard;
import javax.swing.JFrame;
import loginwindow.LoginForm;
import loginwindow.LoginSession;

/**
 *
 * @author derrelldowney
 */
public class RegisterExit {
    public static void regExit(JFrame context, AdminDashboard adminDash){
        //LoginSession.isLoggedIn = false;
        context.setVisible(false);
        adminDash.setVisible(true);
    }
}
