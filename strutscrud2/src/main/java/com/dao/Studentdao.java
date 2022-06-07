package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.beans.*;



public class Studentdao {
		public int save(Student p) throws Exception{
			Class.forName("com.mysql.jdbc.Driver");
	        Connection con = DriverManager.getConnection(
	                "jdbc:mysql://localhost/sampledb", "root", "Siva@123");
	        PreparedStatement ps= con.prepareStatement("insert into student(id,name,email,address) values(?,?,?,?)");
	       ps.setInt(1,p.getId());
	        ps.setString(2,p.getName());
	        ps.setString(3,p.getEmail());
	        ps.setString(4, p.getAddress());
//testing	       
//	        System.out.print(p.getId());
//	        System.out.println(p.getName());
	       return  ps.executeUpdate();
	       		}
		
		public ResultSet getStudents() throws Exception {
			Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/sampledb", "root", "Siva@123");
        
        PreparedStatement stmt=con.prepareStatement("select * from student");  
        ResultSet rs=stmt.executeQuery();  
     
        return rs;
        }
		
		
		public ResultSet getStudentsupdate(int id) throws Exception {
			
				Class.forName("com.mysql.jdbc.Driver");
	        Connection con = DriverManager.getConnection(
	                "jdbc:mysql://localhost/sampledb", "root", "Siva@123");
	        Student s=new Student();
	        PreparedStatement stmt=con.prepareStatement("select * from student where id=?");
	        s.setId(id);
	        ResultSet rs=stmt.executeQuery();  
	     
	        return rs;
	        }
			
        }
		
		
