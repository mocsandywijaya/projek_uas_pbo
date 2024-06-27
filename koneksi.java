/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;

import com.mysql.jdbc.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;


public class koneksi {
    private static Connection Connectionmysql;
    public static Connection ConnectionDB(){
        if (Connectionmysql == null) {
            try{
                String DB ="jdbc:mysql://localhost:3306/onlineshoppingDB";
                String user = "root";
                String password ="";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                Connectionmysql = (Connection) DriverManager.getConnection(DB,user,password);
                JOptionPane.showMessageDialog(null, "Connection Success");
            }catch(Exception e) {
                JOptionPane.showMessageDialog(null, "Connection Failed");
                
            }
        }
        return Connectionmysql;
    }
}

   