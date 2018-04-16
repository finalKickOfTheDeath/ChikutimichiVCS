package role;

public class Illustrateur extends Personne {
	
	public Illustrateur() {
		super();
	}

	@Override
	public void traitement(String probleme) {
		if (probleme.equals("Image vide")){
			System.out.println("Ajout de l'image manquante");
		}else
			this.suceessor.traitement(probleme);
	}
}
