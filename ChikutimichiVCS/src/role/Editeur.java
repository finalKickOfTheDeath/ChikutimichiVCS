package role;

public class Editeur extends Personne {
	
	public Editeur() {
		super();
	}

	@Override
	public void traitement(String probleme) {
		System.out.println("Organisation d'une réunion d'equipe");
	}
}
