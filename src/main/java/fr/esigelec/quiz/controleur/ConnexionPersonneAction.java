package fr.esigelec.quiz.controleur;

import java.util.List;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import fr.esigelec.quiz.dao.IPersonneDAO;
import fr.esigelec.quiz.dao.hibernate.PersonneDAOImpl;
import fr.esigelec.quiz.dao.hibernate.QuizDAOImpl;
import fr.esigelec.quiz.dto.Personne;
import fr.esigelec.quiz.dto.Quiz;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConnexionPersonneAction extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		String mail = request.getParameter("mail");
		String mdp = request.getParameter("mdp");
		
		//FAIRE TRANSFORMATION EN MD5
		
		//CHECK MAIL/MDP
		
		/*
		PersonneDAOImpl personneDAO = new PersonneDAOImpl();
		QuizDAOImpl quizDAO = new QuizDAOImpl();
		List<Quiz> listeQuiz = quizDAO.listQuiz();
		Personne personne = null;
		
		if(personne = personneDAO.checkPassword(mail, mdp)) {
			
			
			request.setAttribute("listeQuiz", listeQuiz);
			request.setAttribute("personne", personne);
			return mapping.findForward("succes");
		}
		else {
			return mapping.findForward("erreur");
		}
		*/
		

		return mapping.findForward("erreur");
	}
}