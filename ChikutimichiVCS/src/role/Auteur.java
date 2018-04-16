package ChikutimichiVCS.src.role;

public class Auteur extends Personne {
	
	public Auteur() {
		super();
	}

		@Override
	public void traitement(String probleme) {
		if (probleme.equals("page blanche")){
            System.out.println("Ajout du texte manquant");
        }else
		    this.suceessor.traitement(probleme);
	}
}
