package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import beans.LoginForm;
import dao.LoginDao;

public class LoginController extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		LoginForm lf=(LoginForm) form;
		HttpSession session=request.getSession();
		session.setAttribute("username",lf.getUsername());
		System.out.println(request.getSession().getAttribute("username"));
		LoginDao dao=new LoginDao();
		boolean b=dao.validate(lf);
		if(b==true) {
			
			return mapping.findForward("home");
		}
		else
			return mapping.findForward("fail");
	}
	
}
