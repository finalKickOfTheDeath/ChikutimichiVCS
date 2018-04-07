package role;

public abstract class Personne {
	
	private static int cpt = 0;
	
	private int id;
	private String nom;
	
	public Personne() {
		this.id = ++cpt;
	}
	
	public Personne(String nom) {
		this();
		this.setNom(nom);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getId() {
		return id;
	}

}
