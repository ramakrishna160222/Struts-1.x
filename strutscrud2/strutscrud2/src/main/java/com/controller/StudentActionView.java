package com.controller;

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

public class StudentActionView extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		Studentdao dao=new Studentdao();
		ResultSet rsv=dao.getStudents();
				
		 while(rsv.next()){  
			 Student s=new Student();
			 List<Student> list=new ArrayList<Student>();
//			int id=rsv.getInt(1);
//			String name=rsv.getString(2);
//			String email=rsv.getString(3);
//			String address=rsv.getString(4);  
			 
			 System.out.println(rsv.getInt(1));
			 System.out.println(rsv.getString(2));
			 System.out.println(rsv.getString(3));
			 System.out.println(rsv.getString(4));
			 s.setId(rsv.getInt(1));
			 s.setName(rsv.getString(2));
			 s.setEmail(rsv.getString("email"));
			 s.setAddress(rsv.getString("address"));
			 
			 list.add(s);
			 request.setAttribute("list", list);
			}  
		
		
		return mapping.findForward("view");
		
	}
	/* request.setAttribute("rsv", rsv);
		return mapping.findForward("view"); */

}

