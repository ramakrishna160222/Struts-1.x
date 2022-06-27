package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
	
	public int save(int id,String name,String email,String address)throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/sampledb", "root", "Siva@123");
        PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?,?)");
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setString(3, email);
        ps.setString(4, address);
        int i=ps.executeUpdate();
        con.close();
        return i;
			}
	
public boolean update(int id,String name,String email,String address)throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/sampledb","root","Siva@123");
		PreparedStatement ps=con.prepareStatement("update employee set name=?,email=?,address=? where id=?");
		ps.setString(1, name);
		ps.setString(2, email);
		ps.setString(3, address);
		ps.setInt(4, id);
		
		int i=ps.executeUpdate();
		con.close();
		if(i!=0)
			return true;
		else
			return false;
		
	}

public boolean delete(int id)throws Exception{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost/sampledb","root","Siva@123");
	PreparedStatement ps=con.prepareStatement("delete from employee where id=?");
	ps.setInt(1, id);
	int i=ps.executeUpdate();
	con.close();
	if(i!=0)
		return true;
	else
		return false;
	
}

public List find(int id)throws Exception{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost/sampledb","root","Siva@123");
	PreparedStatement ps=con.prepareStatement("select * from employee where id=?");
	ps.setInt(1, id);
	ResultSet rs=ps.executeQuery();
	List l=new ArrayList();
	if(rs.next()) {
		l.add(rs.getInt(1));
		l.add(rs.getString(2));
		l.add(rs.getString(3));
		l.add(rs.getString(4));
			}
	con.close();
	return l;
	
}

public List findAll()throws Exception{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost/sampledb","root","Siva@123");
	PreparedStatement ps=con.prepareStatement("select * from employee ");
	ResultSet rs=ps.executeQuery();
	List l=new ArrayList();
	while(rs.next()) {
		l.add(rs.getInt(1));
		l.add(rs.getString(2));
		l.add(rs.getString(3));
		l.add(rs.getString(4));
		
	}
	con.close();
	return l;
	
}

}
