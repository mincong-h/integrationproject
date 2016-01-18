package fr.esigelec.quiz.controleur;

import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import fr.esigelec.quiz.dao.IPersonneDAO;
import fr.esigelec.quiz.dao.IQuizDAO;
import fr.esigelec.quiz.dao.hibernate.PersonneDAOImpl;
import fr.esigelec.quiz.dao.hibernate.QuizDAOImpl;
import fr.esigelec.quiz.dto.Personne;
import fr.esigelec.quiz.dto.Quiz;
import fr.esigelec.quiz.forms.ConnexionForm;
import fr.esigelec.quiz.util.SecurityHelper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConnexionAdministrateurAction extends Action {

	private final Logger connexionAdministrateurActionLogger = Logger.getLogger(ConnexionAdministrateurAction.class);
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws SQLException {

		connexionAdministrateurActionLogger.debug("Execute");
		
		ConnexionForm f= (ConnexionForm) form;
		String mail = f.getMail();
		String mdp = SecurityHelper.MD5(f.getPassword());
		
		IPersonneDAO personneDAO = new PersonneDAOImpl();
		IQuizDAO quizDAO = new QuizDAOImpl();
		List<Quiz> listeQuiz = quizDAO.listQuiz();
		Personne personne = personneDAO.getPersonne(mail);
		
		if( personne == null ) {
			connexionAdministrateurActionLogger.debug("Action terminee avec erreur : les coordonnees ne correspondent pas � un administrateur");
			return mapping.findForward("erreur");
		}
		else if(!mdp.equals(personne.getMdp())) {
			connexionAdministrateurActionLogger.debug("Action terminee avec erreur : mot de passe incorrect");
			return mapping.findForward("erreur");
		}
		else {
			request.setAttribute("listeQuiz", listeQuiz);
			request.setAttribute("personne", personne);
			connexionAdministrateurActionLogger.debug("Connexion r�ussie");
			return mapping.findForward("succes");
		}
	}
}