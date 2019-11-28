/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_praktikum_pbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static uts_praktikum_pbd.Uts_Praktikum_PBD.Jdbc_driver;

/**
 *
 * @author LENOVO
 */
public class Koneksi_DB {
    static final String Jdbc_driver = "com.mysql.jdbc.Driver";
    static final String root = "jdbc:mysql://localhost/uts_pemograman_database";
    static final String username = "root";
    static final String password = "";
    
    

    static Connection con;
    static Statement st;
    static ResultSet rs;
    public static String user;
    
    
    public static void connection() {
        try {
            Class.forName(Jdbc_driver);
            con = DriverManager.getConnection(root, username, password);
            st = (Statement) con.createStatement();
        } catch (Exception e) {
            e.getMessage();
        }
    }
    
}
