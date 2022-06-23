package com.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.beans.Student;
import com.dao.Studentdao;

public class StudentActionUpdate extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stud
		int id=Integer.parseInt(request.getParameter("id"));
		Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/sampledb", "root", "Siva@123");
        Studentdao dao=new Studentdao();
        ResultSet rsv=dao.getStudentsupdate(id);
        List<Student> list=new ArrayList<Student>();
        Student s=new Student();
        s.setId(rsv.getInt(1));
		 s.setName(rsv.getString(2));
		 s.setEmail(rsv.getString("email"));
		 s.setAddress(rsv.getString("address"));
		 list.add(s);
		 request.setAttribute("list", list);
		 return mapping.findForward("updateform");
	}
}
