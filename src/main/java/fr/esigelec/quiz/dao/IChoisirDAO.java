package fr.esigelec.quiz.dao;

import java.util.List;
import fr.esigelec.quiz.dto.Choisir;
import fr.esigelec.quiz.dto.Personne;
import fr.esigelec.quiz.dto.Proposition;
import fr.esigelec.quiz.dto.Quiz;

/**Projet d'integration
 * Le jeu de TF8
 * GSI-IR
 * @author BOSSO BOSSO Ghyslaine
 * @author CHOUAKRIA Farid
 * @author DELAUNAY Brice
 * @author NGANE Pascale
 * 
 * Interface IChoisirDAO
 */

public interface IChoisirDAO {
	
	
	public boolean createChoix(Choisir c);
	
	public boolean updateChoix(Choisir c);
	
	public boolean deleteChoix(Choisir c);
	
	public List<Choisir> getChoixPersonne(Personne P, Quiz q);
	
}
