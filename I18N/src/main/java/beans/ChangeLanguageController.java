package beans;

import java.util.Locale;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import jakarta.servlet.http.HttpSession;

public class ChangeLanguageController extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String language=request.getParameter("language");
		Locale locale=new Locale(language);
		javax.servlet.http.HttpSession session=request.getSession();
		session.setAttribute("org.apache.struts.action.LOCALE",locale);
		return mapping.findForward("index");
	}
	
}
