package application;

import builder.BuidlerMangaQuebec;
import builder.Builder;
import builder.BuilderMangaEtranger;
import builder.Workspace;
import planche.PlancheCorrigee;
import planche.Planche;
import planche.PlancheOriginale;
import planche.PlancheRetouchee;
import planche.PlancheTraduite;
import serie.Projet;

public class Application {

	public static void main(String[] args) {
		
		/*
		 * Builder
		 */
		
		System.out.println("///////////////////////////////////////////////////");
		System.out.println("                  // BUILDER //                    ");
		System.out.println("///////////////////////////////////////////////////\n");
		
		
		Builder builderMangaEtranger = new BuilderMangaEtranger();
		Builder builderMangaQuebec = new BuidlerMangaQuebec();
		
		Projet maidSamaProjet = new Workspace().construire(builderMangaEtranger, "Maid Sama!");
		System.out.println();
		
		Projet headHockeyProjet = new Workspace().construire(builderMangaQuebec, "Head Hockey");
		System.out.println();
		
		Projet idolish7Projet = new Workspace().construire(builderMangaEtranger, "Idolish7");
		
		System.out.println("\n\n\n");
		
		/*
		 * Decorator
		 */
		
		System.out.println("///////////////////////////////////////////////////");
		System.out.println("                 // DECORATOR //                   ");
		System.out.println("///////////////////////////////////////////////////\n");
		
		
		//Planche originale
		Planche plancheO = new PlancheOriginale();
		
		//Planche traduite
		Planche plancheT = new PlancheTraduite(plancheO);
		System.out.println("Commentaire: Planche traduite");
		plancheT.state();
		System.out.println("\n");
		
		//Planche corrig�e
		Planche plancheC = new PlancheCorrigee(plancheT);
		System.out.println("Commentaire: Planche corrig�e");
		plancheC.state();
		System.out.println("\n");
		
		//Planche retouch�e
		Planche plancheR = new PlancheRetouchee(plancheC);
		System.out.println("Commentaire: Planche retouch�e");
		plancheR.state();
		
		System.out.println("\n\n\n");
		
		
		/*
		 * Chain of responsability
		 */
		
		System.out.println("///////////////////////////////////////////////////");
		System.out.println("           // CHAIN OF RESPONSABILIY //            ");
		System.out.println("///////////////////////////////////////////////////\n");
		
	}

}
