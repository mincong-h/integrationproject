package fr.esigelec.quiz.dto;

/**Projet d'integration
 * Le jeu de TF8
 * @author GSI-IR
 * BOSSO BOSSO Ghyslaine and NGANE Pascale
 * Classe Question
 * */

public class Proposition implements Comparable<Proposition> {


	/**Attributs de la classe Proposition*/


	/**
	 * identifiant de la proposition
	 */
	private int id; 

	/**
	 * libelle de la proposition
	 */
	private String libelle; 

	/*
	 * Si c'est la bonne réponse au quiz
	 */
	boolean estBonneReponse;
	
	private double pourcentage;
	
	
	private Question question;
	
	/*Constructeurs*/

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	/**
	 * Constructeur sans paramétres
	 */
	public Proposition() {
		super();
		this.id = 0;
		this.libelle = "";
		this.estBonneReponse = false;
		this.pourcentage = 0;
	}

	/**
	 * Constructeur avec paramétres
	 * @param id
	 * @param libelle
	 */
	public Proposition(String libelle, boolean estBonneReponse) {
		super();
		this.id = 0;
		this.libelle = libelle;
		this.estBonneReponse = estBonneReponse;
		this.pourcentage = 0;
	}


	/**
	 * Constructeur par recopie
	 * @param Proposition p
	 */
	public Proposition(Proposition p) {
		super();
		this.id = p.id;
		this.libelle = p.libelle;
		this.estBonneReponse = p.estBonneReponse;
		this.pourcentage = p.pourcentage;
	}

	/*Getters et setters*/

	/**
	 * méthode: getId()
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * méthode: setId()
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * méthode: getLibelle()
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	public double getPourcentage() {
		return pourcentage;
	}

	public void setPourcentage(double pourcentage) {
		this.pourcentage = pourcentage;
	}

	/**
	 * méthode: setLibelle()
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public boolean isEstBonneReponse() {
		return estBonneReponse;
	}

	public void setEstBonneReponse(boolean estBonneReponse) {
		this.estBonneReponse = estBonneReponse;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (estBonneReponse ? 1231 : 1237);
		result = prime * result + id;
		result = prime * result + ((libelle == null) ? 0 : libelle.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Proposition other = (Proposition) obj;
		if (estBonneReponse != other.estBonneReponse)
			return false;
		if (id != other.id)
			return false;
		if (libelle == null) {
			if (other.libelle != null)
				return false;
		} else if (!libelle.equals(other.libelle))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Proposition [id=" + id + ", libelle=" + libelle + ", estBonneReponse=" + estBonneReponse + "]";
	}

	@Override
	public int compareTo(Proposition p) {
		if(this.getId() < p.getId())
			return -1;
		else if (this.getId() == p.getId())
			return 0;
		else 
			return 1;
	}
}