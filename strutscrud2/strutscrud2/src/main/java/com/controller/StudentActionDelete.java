package com.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.beans.Student;
import com.mysql.cj.Query;

public class StudentActionDelete extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		int id=Integer.parseInt(request.getParameter("id"));
		
		Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/sampledb", "root", "Siva@123");
        
		PreparedStatement stmt=con.prepareStatement("delete from student where id=?");  
		stmt.setInt(1,id); 
		int i=stmt.executeUpdate();
		return mapping.findForward("success");
	}

}
