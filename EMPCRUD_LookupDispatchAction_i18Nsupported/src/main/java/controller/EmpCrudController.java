package controller;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.apache.struts.actions.LookupDispatchAction;

import com.mysql.cj.protocol.Resultset;

import beans.Employee;
import dao.EmployeeDao;

public class EmpCrudController extends LookupDispatchAction {
	
	
	
	
	@Override
	protected Map getKeyMethodMap() {
		Map m=new HashMap();
		m.put("save", "save");
		m.put("update","update");
		m.put("delete","delete");
		m.put("find","find");
		m.put("findAll","findAll");
		return m;
	}
	public ActionForward save(ActionMapping am, ActionForm af, HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		Employee e=(Employee) af;
		EmployeeDao dao=new EmployeeDao();
		int i=dao.save(e);
		
		
		if(i!=0)
			return am.findForward("success");
		else
			return am.findForward("fail");
	}
	
	public ActionForward update(ActionMapping am,ActionForm af,HttpServletRequest req,HttpServletResponse res)
		throws Exception{
		Employee e=(Employee) af;
		EmployeeDao dao=new EmployeeDao();
		boolean b=dao.update(e);
		if(b==true)
			return am.findForward("success");
		else
			return am.findForward("fail");
		
	}
	public ActionForward delete(ActionMapping am,ActionForm af,HttpServletRequest req,HttpServletResponse res) 
		throws Exception{
		Employee e=(Employee) af;
		EmployeeDao dao=new EmployeeDao();
		boolean b=dao.delete(e);
		if(b==true)
			return am.findForward("success");
		else
			return am.findForward("fail");
	}
	public ActionForward find(ActionMapping am,ActionForm af,HttpServletRequest req,HttpServletResponse res)
		throws Exception{
		Employee e=(Employee) af;
		EmployeeDao dao=new EmployeeDao();
		List<Employee> list=dao.find(e);
		req.setAttribute("reslist",list);
		 System.out.println(list.get(0));
		 System.out.println(list.get(1));
		 System.out.println(list.get(2));
		 System.out.println(list.get(3));
			
		return am.findForward("find");
	}
	public ActionForward findAll(ActionMapping am,ActionForm af,HttpServletRequest req,HttpServletResponse res) 
			throws Exception{
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
