package builder;

import serie.Projet;
import serie.Tome;

public class BuilderMangaEtranger extends Builder {
	
	private Projet projet;
	
	public BuilderMangaEtranger() {}
	
	@Override
	public void creerProjet(String titre) {
		projet = new Projet(titre);
	}

	@Override
	public void creerOeuvre() {
		projet.ajouterTome(new Tome());
	}

	@Override
	public void creerEquipe() {
		projet.getEquipe().creerEquipeMangaEtranger();
	}

	@Override
	public Projet getProjet() {
		return projet;
	}

	

}
