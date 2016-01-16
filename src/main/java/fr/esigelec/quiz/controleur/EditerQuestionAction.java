package fr.esigelec.quiz.controleur;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import fr.esigelec.quiz.dao.IQuestionDAO;
import fr.esigelec.quiz.dao.IQuizDAO;
import fr.esigelec.quiz.dao.hibernate.QuestionDAOImpl;
import fr.esigelec.quiz.dao.hibernate.QuizDAOImpl;
import fr.esigelec.quiz.dto.Personne;
import fr.esigelec.quiz.dto.Question;
/**
 * 
 * @author Vincent Marion & Damien Bellenger
 *
 */

public class EditerQuestionAction extends Action {
	private static final Logger editerQuestionActionLogger = Logger.getLogger(EditerQuestionAction.class);
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		try {
			// Get parameters and sessions
			Personne p = (Personne) request.getSession().getAttribute("personne");
			int idQuestion = Integer.parseInt(request.getParameter("idQuestion"));
			String libelle = request.getParameter("libelle");
			
			if (p.getDroits() == Personne.ADMIN) {
				if(!libelle.equals("")){
					IQuestionDAO questionDAO = new QuestionDAOImpl();
					Question question = questionDAO.getQuestion(idQuestion);
					question.setLibelle(libelle);
					questionDAO.updateQuestion(question);
					request.setAttribute("listeQuestions", questionDAO.listQuestion());
					return mapping.findForward("succes"); // questionsQuizzAdmin.jsp 
				}
				else editerQuestionActionLogger.info("erreur: libelle vide");
			} else editerQuestionActionLogger.info("erreur: droit d'admin requis");
			
			
		} catch (Exception e) {
			e.printStackTrace();
			// Add attributes of error message
			editerQuestionActionLogger.info("erreur: "+e);
		}
		return mapping.findForward("succes");
	}
}