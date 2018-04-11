package builder;

import role.Equipe;
import serie.Projet;

public class ProjetBuilderJapon extends ProjetBuilder {

	@Override
	public Projet creerProjet(String titre) {
		return new Projet(titre);
	}

	@Override
	public void creerTome(Projet projet) {
		
	}

	@Override
	public void creerEquipe(Projet projet) {
		projet.setEquipe(new Equipe().creerEquipeJapon());
	}
	
}
