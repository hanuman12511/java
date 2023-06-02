/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectionDb;
import java.sql.*;

/**
 *
 * @author Admin
 */
public class ConnectionDb {
      Connection con=null;
  Connection  ConnectionData(String db){
      try{
          Class.forName("com.mysql.jdbc.Driver");
          String url ="jdbc:mysql://localhost:3307/"+db;
          con = DriverManager.getConnection(url,"root","root");
      }catch(Exception e){
          System.out.println(""+e);
      }
            return con;
    }
}
