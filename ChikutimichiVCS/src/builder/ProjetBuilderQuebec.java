package builder;

import role.Equipe;
import serie.Chapitre;
import serie.Projet;
import serie.Tome;

public class ProjetBuilderQuebec extends ProjetBuilder {
	
	private int nbChapitreInit;
	
	public ProjetBuilderQuebec(int nbChapitreInit) {
		this.nbChapitreInit = nbChapitreInit;
	}

	@Override
	public Projet creerProjet(String titre) {
		return new Projet(titre);
	}

	@Override
	public void creerTome(Projet projet) {
		projet.ajouterTome(new Tome(projet.getTitre()));
		for (int i = 0; i < this.nbChapitreInit; i++) {
			projet.getTomes().get(0).ajouterChapitre(new Chapitre());
		}
	}

	@Override
	public void creerEquipe(Projet projet) {
		projet.setEquipe(new Equipe().creerEquipeQuebec());
	}
	

}
