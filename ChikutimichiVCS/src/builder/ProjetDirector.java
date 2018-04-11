package builder;

import serie.Projet;

public class ProjetDirector {
	
	ProjetBuilder builder;
	String titre;
	
	public ProjetDirector(ProjetBuilder builder) {
		this.builder = builder;
	}
	
	public ProjetDirector setTitre(String titre) {
		this.titre = titre;
		return this;
	}
	
	public Projet build() {
		Projet projet = builder.creerProjet(titre);
		builder.creerTome(projet);
		builder.creerEquipe(projet);
		return projet;
	}

}
