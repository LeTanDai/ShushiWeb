/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class DBContext implements DatabaseInfor {
    
    public DBContext(){
        
    }
    
    public Connection getConnection(){
        Connection conn = null;
        try{
            Class.forName(driverName);
            conn = DriverManager.getConnection(url, user, pass);
        }catch(Exception e){
            e.printStackTrace();
        }
        return conn;
    }
    public void close(Connection conn, PreparedStatement ps, ResultSet rs) throws SQLException{
        if(rs != null && !rs.isClosed()){
            rs.close();
        }
        if(ps!= null && !ps.isClosed()){
            ps.close();
        }
        if(rs!= null && !rs.isClosed()){
            rs.close();
        }
    }
}
