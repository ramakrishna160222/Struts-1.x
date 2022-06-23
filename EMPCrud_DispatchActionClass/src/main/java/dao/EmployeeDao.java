package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.x.protobuf.MysqlxPrepare.Execute;

import beans.Employee;

public class EmployeeDao {
	
	public int save(Employee e) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/sampledb", "root", "Siva@123");
        PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?,?)");
        ps.setInt(1,e.getId());
        ps.setString(2,e.getName());
        ps.setString(3, e.getEmail());
        ps.setString(4, e.getAddress());
        int i=ps.executeUpdate();
        con.close();
        return i;    
	}
	
	public boolean update(Employee e)throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/sampledb", "root", "Siva@123");
        PreparedStatement ps=con.prepareStatement("update employee set name=?,email=?,address=? where id=?");
        ps.setString(1, e.getName());
        ps.setString(2, e.getEmail());
        ps.setString(3, e.getAddress());
        ps.setInt(4, e.getId());
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
                "jdbc:mysql://localhost/sampledb", "root", "Siva@123");
        PreparedStatement ps=con.prepareStatement("delete from employee where id=?");
        ps.setInt(1,e.getId());
        int i=ps.executeUpdate();
        con.close();
        if(i!=0)
        	return true;
        else
        	return false;
	}
	public List find(Employee e)throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/sampledb", "root", "Siva@123");
        PreparedStatement ps=con.prepareStatement("select * from employee where id=?");
        ps.setInt(1, e.getId());
       ResultSet rs= ps.executeQuery();
      List list=new ArrayList();
      if(rs.next()) {
    	  list.add(rs.getInt("id"));
    	  list.add(rs.getString("name"));
    	  list.add(rs.getString("email"));
    	  list.add(rs.getString("address"));
      }
       con.close();
       return list;	
	}
	
	public ResultSet findAll()throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/sampledb", "root", "Siva@123");
        PreparedStatement ps=con.prepareStatement("select * from employee");	
       ResultSet rs= ps.executeQuery();
       return  rs;	
	}
	
	

}
