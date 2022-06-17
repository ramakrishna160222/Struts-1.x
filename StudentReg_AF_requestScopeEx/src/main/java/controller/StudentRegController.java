package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import formbeans.Student;

public class StudentRegController extends Action {
	public StudentRegController() {
		System.out.println("StudentRegController Object ....");
	}
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		Student st=(Student) form;
		System.out.println(st.getName());
		System.out.println(st.getEmail());
		System.out.println(st.getAddress());
		
		return mapping.findForward("success");
		
	}

}
