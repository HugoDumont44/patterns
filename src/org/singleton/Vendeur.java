package org.singleton;

public class Vendeur {
	protected String nom;
	protected String adresse;
	protected String email;
	
	private static Vendeur _instance = null;
	
	//constructeur
	private Vendeur(){}
	
	public static Vendeur getInstance(){
		if (_instance == null)
			_instance = new Vendeur();
	
		return _instance;
	}
	
	//méthode métier
	public void affiche(){
		System.out.println("Nom : "+nom);
		System.out.println("Adresse : "+adresse);
		System.out.println("Email : "+email);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
