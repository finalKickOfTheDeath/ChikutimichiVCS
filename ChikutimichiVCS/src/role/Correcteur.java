package role;

public class Correcteur extends Personne {
	
	public Correcteur() {
		super();
	}

	@Override
	public void traitement(String probleme) {
		if (probleme.equals("faute orthographique")){
			System.out.println("Correction de l'erreur");
		}else
			this.suceessor.traitement(probleme);
	}
}
