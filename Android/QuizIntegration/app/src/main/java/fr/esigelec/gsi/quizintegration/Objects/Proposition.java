package fr.esigelec.gsi.quizintegration.objects;

/**
 * Created by Kevin PACE
 */
public class Proposition {

	/* Attribute */
	private int id;
	private String libelle;

	/* Getters & Setters */
	public Proposition (int id, String libelle)
	{
		this.id = id;
		this.libelle = libelle;
	}
	public Proposition ()
	{

	}
	public int getId ()
	{
		return id;
	}

	public void setId (int id)
	{
		this.id = id;
	}

	public String getLibelle ()
	{
		return libelle;
	}

	public void setLibelle (String libelle)
	{
		this.libelle = libelle;
	}
}
