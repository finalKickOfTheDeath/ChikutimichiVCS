package builder;

import serie.Projet;

public class Application {

	public static void main(String[] args) {
		
		Builder builderMangaEtranger = new BuilderMangaEtranger();
		Builder builderMangaQuebec = new BuidlerMangaQuebec();
		
		Projet maidSamaProjet = new Workspace().construire(builderMangaEtranger, "Maid Sama!");
		Projet headHockeyProjet = new Workspace().construire(builderMangaQuebec, "Head Hockey");
		Projet idolish7Projet = new Workspace().construire(builderMangaEtranger, "Idolish7");
		
	}

}
