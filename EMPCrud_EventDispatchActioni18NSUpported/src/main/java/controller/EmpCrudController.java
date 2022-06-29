package controller;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.apache.struts.actions.EventDispatchAction;
import org.apache.struts.actions.LookupDispatchAction;

import beans.Employee;
import dao.EmployeeDao;

public class EmpCrudController extends EventDispatchAction{
	
	public ActionForward empsave(ActionMapping am, ActionForm af, HttpServletRequest req, HttpServletResponse res)
			throws Exception {
				Employee e=(Employee) af;
				EmployeeDao dao=new EmployeeDao();
				int i=dao.save(e);
				if(i!=0)
					return am.findForward("success");
				else
					return am.findForward("fail");	
	}
	
	
	public ActionForward empupdate(ActionMapping am, ActionForm af, HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		Employee e=(Employee) af;
		EmployeeDao dao=new EmployeeDao();
		boolean b=dao.update(e);
		if(b==true)
			return am.findForward("success");
		else
			return am.findForward("fail");
	}
	
	
	public ActionForward empdelete(ActionMapping am, ActionForm af, HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		Employee e=(Employee) af;
		EmployeeDao dao = new EmployeeDao();
		boolean b=dao.delete(e);
		if(b==true)
			return am.findForward("success");
		else
			return am.findForward("fail");
		
	}
	
	
	public ActionForward empfind(ActionMapping am, ActionForm af, HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		Employee e=(Employee) af;
		EmployeeDao dao = new EmployeeDao();
		ResultSet rsv=dao.find(e);
		List list=new ArrayList();
		while(rsv.next()) {
			System.out.println(rsv.getString(2));
			int id=rsv.getInt(1);
			String name=rsv.getString(2);
			String email=rsv.getString(3);
			String address=rsv.getString(4);
			Employee ef=new Employee();
			ef.setId(id);
			ef.setName(name);
			ef.setEmail(email);
			ef.setAddress(address);
			list.add(ef);
		}
	req.setAttribute("reslist",list);
	return am.findForward("find");
	
	}
	
	
	public ActionForward empfindAll(ActionMapping am, ActionForm af, HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		EmployeeDao dao=new EmployeeDao();
		ResultSet rsv=dao.findAll();
		List list=new ArrayList();
			while(rsv.next()) {
				int id=rsv.getInt(1);
				String name=rsv.getString(2);
				String email=rsv.getString(3);
				String address=rsv.getString(4);
				Employee e=new Employee();
				e.setId(id);
				e.setName(name);
				e.setEmail(email);
				e.setAddress(address);
				list.add(e);
				
			}
			req.setAttribute("reslist", list);
	return am.findForward("findAll");
	}

}
