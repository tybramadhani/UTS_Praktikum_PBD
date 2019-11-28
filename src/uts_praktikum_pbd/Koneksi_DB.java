/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_praktikum_pbd;

import java.sql.DriverManager;
import java.sql.Statement;
import static uts_praktikum_pbd.Uts_Praktikum_PBD.Jdbc_driver;

/**
 *
 * @author LENOVO
 */
public class Koneksi_DB {
    try {
            Class.forName(Jdbc_driver);
            con = DriverManager.getConnection(root, username, password);
            st = (Statement) con.createStatement();
        } catch (Exception e) {
            e.getMessage();
        }
}
