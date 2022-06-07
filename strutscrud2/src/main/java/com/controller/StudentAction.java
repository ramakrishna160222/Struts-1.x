package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.beans.Student;
import com.dao.Studentdao;

public class StudentAction extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		Studentdao dao=new Studentdao();
		Student student=(Student) form;
			
		int i=dao.save(student);
		if(i!=0)
			return mapping.findForward("success");
		else
			return mapping.findForward("fail");
	}
    
}
