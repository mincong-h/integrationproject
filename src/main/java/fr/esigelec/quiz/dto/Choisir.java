package fr.esigelec.quiz.dto;

import java.io.Serializable;
import java.sql.Timestamp;

public class Choisir implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;

	private Timestamp date;
	
	private Proposition proposition;
	
	private Quiz quiz;
	
	private Personne personne;

	public Choisir() {}
	
	//
	// @Deprecated
	// Deprecation annulee suite au changement au controlleur
	//     fr.esigelec.quiz.controleur.ChoisirAction
	//													marque par @mincong-h
	//
	public Choisir(Timestamp date, Proposition proposition, Quiz quiz, Personne personne) {
		this.date = date;
		this.proposition = proposition;
		this.quiz = quiz;
		this.personne = personne;
	}
	
	public Choisir(int id,Timestamp date, Proposition proposition, Quiz quiz, Personne personne) {
		this.id=id;
		this.date = date;
		this.proposition = proposition;
		this.quiz = quiz;
		this.personne = personne;
	}

	@Override
	public String toString() {
		return "Choisir [id=" + id + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Choisir other = (Choisir) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public Proposition getProposition() {
		return proposition;
	}

	public void setProposition(Proposition proposition) {
		this.proposition = proposition;
	}

	public Quiz getQuiz() {
		return quiz;
	}

	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}

	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}
}
