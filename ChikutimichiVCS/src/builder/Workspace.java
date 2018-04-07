package builder;

import serie.Projet;

public class Workspace {
	
	public Workspace() {}
	
	public Projet construire(Builder builder, String titre) {
		builder.creerProjet(titre);
		builder.creerOeuvre();
		builder.creerEquipe();
		return builder.getProjet();
	}

}
