package controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginController {
	String dbUrl="jdbc:mysql://srv1113.hstgr.io/u222487541_portal";
    String dbUname="u222487541_mara";
    String dbPassword="Hello105@";
    String dbDriver="com.mysql.cj.jdbc.Driver";
	String email,pass;
	public LoginController(String email,String pass){
		this.pass=pass;
		this.email=email;
	}
	public boolean toStore(){
		 Connection con = null;
	   		try{
	   			Class.forName(dbDriver);  //class not found exception
	 			con = DriverManager.getConnection(dbUrl,dbUname,dbPassword);   //sql Exception
	 			String sql = "select * from AdminTable where email='"+email+"' and password='"+pass+"'";	 		
	 		    Statement s = con.createStatement();
	 			ResultSet rs=s.executeQuery(sql);
	 			
	 			if(rs.next()) {
	 				con.close();
	 				return true;
	 			}
	 			
	 			con.close();
	 		   	
			 }catch(Exception e){      
				e.printStackTrace();
			 }
	   		return false;
		
	}
}
