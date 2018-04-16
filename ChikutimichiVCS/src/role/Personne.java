package ChikutimichiVCS.src.role;

public abstract class Personne implements Chaine{
	
	private static int cpt = 0;
	protected Personne suceessor;

	private int id;
	private String nom;
	
	public Personne() {
		this.id = ++cpt;
	}
	
	public Personne(String nom) {
		this();
		this.setNom(nom);
	}

    @Override
    public void SetSuccessor(Personne p) {
        this.suceessor = p;
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
