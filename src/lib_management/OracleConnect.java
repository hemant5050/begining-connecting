/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Lenovo
 */
import java.sql.*;
public class OracleConnect {
       static Connection getConn(){
           
   try{
       Class.forName("oracle.jdbc.driver.OracleDriver");
       Connection oConnection =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123");
       return oConnection;
   }  catch(SQLException oSQLException){
       System.out.println(oSQLException);
       return null;
   }catch (ClassNotFoundException oClassNotFoundException){
       System.out.println(oClassNotFoundException);
       return null;
   }
   }
}


