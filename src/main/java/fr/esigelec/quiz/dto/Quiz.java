package fr.esigelec.quiz.dto;
import java.sql.Timestamp;


/**Projet d'integration
 * Le jeu de TF8
 * @author GSI-IR
 * BOSSO BOSSO Ghyslaine and NGANE Pascale
 * Classe Quiz
 * */

public class Quiz {

	/*Attributs de la classe Quiz*/

	/**
	 * identifiant du quiz
	 */
	private int id; 

	/**
	 * libelle du quiz;
	 */
	private String libelle; 

	/**
	 * Date et heure de d�but du quiz
	 */
	private Timestamp dateDebutQuiz; 

	/**
	 * Date et heure de fin du quiz
	 * */
	private Timestamp dateFinQuiz; 

	/**
	 * Identifiant de la question en cours du quiz
	 * */
	private int noQuestionCourante; 

	/**
	 * date et heure de d�but de la question
	 */
	private Timestamp dateDebutQuestion;

	/**
	 * �tape 
	 * 1 : en cours
	 *  2 : affichage de statistiques
	 *   3 : affichage r�ponse + classement
	 */
	private int etape;



	/*Constructeurs*/

	/**
	 * Constructeur sans param�tres
	 */

	public Quiz() {
		super();
	}

	/**
	 * Constructeur avec param�tres
	 * @param id
	 * @param libelle
	 * @param dateDebutQuiz
	 * @param dateFinQuiz
	 * @param noQuestionCourante
	 * @param etape
	 */

	public Quiz(int id, String libelle, Timestamp dateDebutQuiz,
			Timestamp dateFinQuiz,Timestamp dateDebutQuestion, int noQuestionCourante, int etape) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.dateDebutQuiz = dateDebutQuiz;
		this.dateFinQuiz = dateFinQuiz;
		this.noQuestionCourante = noQuestionCourante;
		this.dateDebutQuestion=dateDebutQuestion;
		this.etape = etape;
	}

	/**
	 * Constructeur par recopie
	 * @param Quiz z
	 */

	public Quiz(Quiz q) {
		super();
		this.id = q.id;
		this.libelle = q.libelle;
		this.dateDebutQuiz = q.dateDebutQuiz;
		this.dateFinQuiz = q.dateFinQuiz;
		this.dateDebutQuestion=q.dateDebutQuestion;
		this.noQuestionCourante = q.noQuestionCourante;
		this.etape = q.etape;
	}


	/*Getters et setters*/

	/**
	 * m�thode getId()
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * m�thode: setId()
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * m�thode: getLibelle()
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * m�thode: setLibelle()
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * m�thode:getDateDebutQuiz()
	 * @return the dateDebutQuiz
	 */
	public Timestamp getDateDebutQuiz() {
		return dateDebutQuiz;
	}

	/**
	 * m�thode: setDateDebutQuiz()
	 * @param dateDebutQuiz the dateDebutQuiz to set
	 */
	public void setDateDebutQuiz(Timestamp dateDebutQuiz) {
		this.dateDebutQuiz = dateDebutQuiz;
	}

	/**
	 * m�thode:getDateFinQuiz()
	 * @return the dateFinQuiz
	 */
	public Timestamp getDateFinQuiz() {
		return dateFinQuiz;
	}

	/**
	 * m�thode: setDateFinQuiz
	 * @param dateFinQuiz the dateFinQuiz to set
	 */
	public void setDateFinQuiz(Timestamp dateFinQuiz) {
		this.dateFinQuiz = dateFinQuiz;
	}

	/**
	 * m�thode: getNoQuestionCourante
	 * @return the noQuestionCourante
	 */
	public int getNoQuestionCourante() {
		return noQuestionCourante;
	}

	/**
	 * m�thode: setNoQuestionCourante
	 * @param noQuestionCourante the noQuestionCourante to set
	 */
	public void setNoQuestionCourante(int noQuestionCourante) {
		this.noQuestionCourante = noQuestionCourante;
	}

	/**
	 * m�thode: getDateDebutQuestion()
	 * @return the dateDebutQuestion
	 */
	public Timestamp getDateDebutQuestion() {
		return dateDebutQuestion;
	}

	/**
	 * m�thode: setDateDebutQuestion()
	 * @param dateDebutQuestion the dateDebutQuestion to set
	 */
	public void setDateDebutQuestion(Timestamp dateDebutQuestion) {
		this.dateDebutQuestion = dateDebutQuestion;
	}

	/**
	 * m�thode: getEtape()
	 * @return the etape
	 */
	public int getEtape() {
		return etape;
	}

	/**
	 * m�thode: setEtape()
	 * @param etape the etape to set
	 */
	public void setEtape(int etape) {
		this.etape = etape;
	}

}
