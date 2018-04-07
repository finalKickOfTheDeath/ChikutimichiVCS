package builder;

import serie.Projet;

public abstract class Builder {
	
	public Builder() {}
	
	public abstract void creerProjet(String titre);

	public abstract void creerOeuvre();

	public abstract void creerEquipe();

	public abstract Projet getProjet();

	

}
