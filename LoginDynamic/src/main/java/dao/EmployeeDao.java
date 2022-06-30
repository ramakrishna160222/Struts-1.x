package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import beans.Employee;

public class EmployeeDao {
	public int save(Employee e) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/employee", "root", "Siva@123");
        PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?,?,?,?)");
        ps.setInt(1,e.getId());
        ps.setString(2,e.getName());
        ps.setString(3, e.getEmail());
        ps.setString(4, e.getGender());
        ps.setString(5, e.getUsername());
        ps.setString(6, e.getPassword());
        int i=ps.executeUpdate();
        con.close();
        return i;    
	}
	
	public boolean update(Employee e)throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/employee", "root", "Siva@123");
        PreparedStatement ps=con.prepareStatement("update employee set name=?,email=?,gender=?,username=?,password=? where id=?");
        ps.setString(1, e.getName());
        ps.setString(2, e.getEmail());
        ps.setString(3, e.getGender());
        ps.setString(4, e.getUsername());
        ps.setString(5, e.getPassword());
        ps.setInt(6, e.getId());
        int i=ps.executeUpdate();
        con.close();
        if(i!=0)
        	return true;
        else
        	return false;
	}
	
	public boolean delete(Employee e)throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/employee", "root", "Siva@123");
        PreparedStatement ps=con.prepareStatement("delete from employee where id=?");
        ps.setInt(1,e.getId());
        int i=ps.executeUpdate();
        con.close();
        if(i!=0)
        	return true;
        else
        	return false;
	}
	
	public ResultSet find(Employee e)throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/employee", "root", "Siva@123");
        PreparedStatement ps=con.prepareStatement("select * from employee where id=?");
        ps.setInt(1, e.getId());
       ResultSet rs= ps.executeQuery();
       System.out.print("DAO");
       return rs;
     
	}
	
	public ResultSet findAll()throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/employee", "root", "Siva@123");
        PreparedStatement ps=con.prepareStatement("select * from employee");	
       ResultSet rs= ps.executeQuery();
       return  rs;	
	}
}
