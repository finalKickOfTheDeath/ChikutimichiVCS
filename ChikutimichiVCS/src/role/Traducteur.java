package role;

public class Traducteur extends Personne {
	
	public Traducteur() {
		super();
	}

	@Override
	public void traitement(String probleme) {
		if (probleme.equals("non-sens")){
			System.out.println("Modification de la traduction");
		}else
			this.suceessor.traitement(probleme);
	}
}
