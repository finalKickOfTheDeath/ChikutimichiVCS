package builder;

import serie.Projet;
import serie.Tome;

public class BuidlerMangaQuebec extends Builder {
	
	private Projet projet;
	
	public BuidlerMangaQuebec() {}
	
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
		projet.getEquipe().creerEquipeMangaQuebec();
	}

	@Override
	public Projet getProjet() {
		return projet;
	}

	

}
