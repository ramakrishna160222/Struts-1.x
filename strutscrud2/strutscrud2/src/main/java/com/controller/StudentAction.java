package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.dao.Studentdao;

public class StudentAction extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String address=request.getParameter("address");
		
		Studentdao dao=new Studentdao();
		
		int i =dao.save(id, name, email, address);
		if(i!=0)
			return mapping.findForward("success");
		else
			return mapping.findForward("fail");
	}
    
}
