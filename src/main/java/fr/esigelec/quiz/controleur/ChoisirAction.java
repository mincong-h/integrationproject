/**
 * @author Rodolphe AGUIDISSOU - ESIGELEC 2016
 */

package fr.esigelec.quiz.controleur;
import java.sql.Timestamp;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import fr.esigelec.quiz.dto.Quiz;


public class ChoisirAction extends Action {
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		
		//UTILS
		HttpSession session = request.getSession();
		
		
		//IN 
		int idProposition = Integer.parseInt(request.getParameter("idProposition"));
	    Quiz quiz  = (Quiz) session.getAttribute("quiz");
		
		Timestamp currentTime = new Timestamp(System.currentTimeMillis() /1000);
		
        Timestamp questionStartTime = quiz.getDateDebutQuestion() ;
        
        Calendar cal = Calendar.getInstance();
        cal.setTime(questionStartTime);
        cal.add(Calendar.SECOND, 30);
       		
		if ( currentTime.before(cal.getTime())){
			
			//OUT 
			session.setAttribute("idProposition", idProposition);
			
		}
		else {
			session.setAttribute("idProposition", idProposition);
		}
		
		return mapping.findForward("succes");
		
		
		
	}

}