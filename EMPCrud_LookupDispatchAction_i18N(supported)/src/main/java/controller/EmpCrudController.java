package controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.apache.struts.actions.LookupDispatchAction;

import dao.EmployeeDao;

public class EmpCrudController extends LookupDispatchAction {
	
	//execute 
	/*
	 * 1.using parameter id will read button vlaue 2.for that value it will find
	 * proper key from properties file 3.it will getKeymethodmap and will get return
	 * value map object 4.from that map it will expect method values using button
	 * keys
	 */
	@SuppressWarnings("unchecked")
	@Override
	protected Map getKeyMethodMap() {
		Map m=new HashMap();
		m.put("save" , "empsave");
		m.put("update", "empupdate");
		m.put("delete", "empdelete");
		m.put("find", "empfind");
		m.put("findAll;", "empfindAll");
		return m;
	}
	
	
	public ActionForward empsave(ActionMapping am, ActionForm af, HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		Employee e=(Employee) af;
		EmployeeDao dao=new EmployeeDao();
		int i=dao.save(e.getId(),e.getName(),e.getEmail(),e.getAddress());
		if(i!=0)
			return am.findForward("success");
		else
			return am.findForward("fail");
		
			
	}
	public ActionForward empupdate(ActionMapping am, ActionForm af, HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		Employee e=(Employee) af;
		EmployeeDao dao=new EmployeeDao();
		boolean b=dao.update(e.getId(),e.getName(),e.getEmail(),e.getAddress());
		if(b==true)
			return am.findForward("success");
		else
			return am.findForward("fail");
	}
	public ActionForward empdelete(ActionMapping am, ActionForm af, HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		Employee e=(Employee) af;
		EmployeeDao dao=new EmployeeDao();
		boolean b=dao.delete(e.getId());
		if(b==true)
			return am.findForward("success");
		else
			return am.findForward("fail");	
	}
	public ActionForward empfind(ActionMapping am, ActionForm af, HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		Employee e=(Employee) af;
		EmployeeDao dao=new EmployeeDao();
		List list=dao.find(e.getId());
		req.setAttribute("list",list);
		return am.findForward("find");
			
	}
	public ActionForward empfindAll(ActionMapping am, ActionForm af, HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		Employee e=(Employee) af;
		EmployeeDao dao=new EmployeeDao();
		List list=dao.findAll();
		req.setAttribute("list", list);
		return am.findForward("findAll");
	}
	
}
