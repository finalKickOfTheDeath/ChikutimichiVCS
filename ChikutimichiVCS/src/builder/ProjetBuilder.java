package builder;

import serie.Projet;

public abstract class ProjetBuilder {
	
	public abstract Projet creerProjet(String titre);
	
	public abstract void creerTome(Projet projet);

	public abstract void creerEquipe(Projet projet);


	

	

}
