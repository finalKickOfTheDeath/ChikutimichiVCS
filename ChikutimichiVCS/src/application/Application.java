package application;

import builder.ProjetBuilderQuebec;

import builder.ProjetBuilderJapon;
import builder.ProjetDirector;
import planche.PlancheCorrigee;
import planche.Planche;
import planche.PlancheOriginale;
import planche.PlancheRetouchee;
import planche.PlancheTraduite;
import role.*;
import serie.Projet;
import serie.Tome;

public class Application {

	public static void main(String[] args) {
		
		/*
		 * Builder
		 */
		
		System.out.println("///////////////////////////////////////////////////");
		System.out.println("                  // BUILDER //                    ");
		System.out.println("///////////////////////////////////////////////////\n");
		
		
		Projet projetMaidSama = new ProjetDirector(new ProjetBuilderJapon()).setTitre("Maid Sama!").build();
		
		System.out.println("Projet " + projetMaidSama.getTitre() + " créé avec succès");
		System.out.println("Equipe composée de " + projetMaidSama.getEquipe().getPersonnes().size() + " personnes");
		System.out.println("Actuellement " + projetMaidSama.getTomes().size() + " tomes en cours d'édition\n");
		
		
		Projet projetWebFic = new ProjetDirector(new ProjetBuilderQuebec(2)).setTitre("WebFic").build();
		
		System.out.println("Projet " + projetWebFic.getTitre() + " créé avec succès");
		System.out.println("Equipe composée de " + projetWebFic.getEquipe().getPersonnes().size() + " personnes");
		System.out.println("Actuellement " + projetWebFic.getTomes().size() + " tomes en cours d'édition");
		System.out.println(projetWebFic.toString());
		
		
		Projet projetIdolish = new ProjetDirector(new ProjetBuilderJapon()).setTitre("Idolish7").build();
		
		System.out.println("Projet " + projetIdolish.getTitre() + " créé avec succès");
		System.out.println("Equipe composée de " + projetIdolish.getEquipe().getPersonnes().size() + " personnes");
		projetIdolish.ajouterTome(new Tome("Monster Generation"));
		projetIdolish.ajouterTome(new Tome("Trigger"));
		projetIdolish.ajouterTome(new Tome("Riku et Tenn"));
		System.out.println("Actuellement " + projetIdolish.getTomes().size() + " tomes en cours d'édition :");
		System.out.println(projetIdolish.toString());
		
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
		
		//Planche corrig?e
		Planche plancheC = new PlancheCorrigee(plancheT);
		System.out.println("Commentaire: Planche corrigée");
		plancheC.state();
		System.out.println("\n");
		
		//Planche retouch?e
		Planche plancheR = new PlancheRetouchee(plancheC);
		System.out.println("Commentaire: Planche retouchée");
		plancheR.state();
		
		System.out.println("\n\n\n");
		
		
		/*
		 * Chain of responsability
		 */
		
		System.out.println("///////////////////////////////////////////////////");
		System.out.println("           // CHAIN OF RESPONSABILIY //            ");
		System.out.println("///////////////////////////////////////////////////\n");

		Auteur Bernard = new Auteur();
		Correcteur Michel = new Correcteur();
		Editeur Alfred = new Editeur();
		Illustrateur Veronique = new Illustrateur();
		Retoucheur Baptiste = new Retoucheur();
		Traducteur Alain = new Traducteur();

		String prob1 = "page blanche";
		String prob2 = "non-sens";
		String prob3 = "Scenario";
		String prob4 = "visuel etrange";

		Bernard.SetSuccessor(Alain);
		Alain.SetSuccessor(Michel);
		Michel.SetSuccessor(Alfred);
		Veronique.SetSuccessor(Baptiste);
		Baptiste.SetSuccessor(Alfred);

		System.out.println("le probleme est "+prob1);
		Bernard.traitement(prob1);
		System.out.println("le probleme est "+prob2);
		Bernard.traitement(prob2);
		System.out.println("le probleme est "+prob3);
		Bernard.traitement(prob3);
		System.out.println("le probleme est "+prob4);
		Veronique.traitement(prob4);
	}

}
