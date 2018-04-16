package ChikutimichiVCS.src.application;

import ChikutimichiVCS.src.builder.ProjetBuilderQuebec;

import ChikutimichiVCS.src.builder.ProjetBuilderJapon;
import ChikutimichiVCS.src.builder.ProjetDirector;
import ChikutimichiVCS.src.planche.PlancheCorrigee;
import ChikutimichiVCS.src.planche.Planche;
import ChikutimichiVCS.src.planche.PlancheOriginale;
import ChikutimichiVCS.src.planche.PlancheRetouchee;
import ChikutimichiVCS.src.planche.PlancheTraduite;
import ChikutimichiVCS.src.role.*;
import ChikutimichiVCS.src.serie.Projet;
import ChikutimichiVCS.src.serie.Tome;

import java.util.concurrent.TransferQueue;

public class Application {

	public static void main(String[] args) {
		
		/*
		 * Builder
		 */
		
		System.out.println("///////////////////////////////////////////////////");
		System.out.println("                  // BUILDER //                    ");
		System.out.println("///////////////////////////////////////////////////\n");
		
		
		Projet projetMaidSama = new ProjetDirector(new ProjetBuilderJapon()).setTitre("Maid Sama!").build();
		
		System.out.println("Projet " + projetMaidSama.getTitre() + " cr?? avec succ?s");
		System.out.println("Equipe compos?e de " + projetMaidSama.getEquipe().getPersonnes().size() + " personnes");
		System.out.println("Actuellement " + projetMaidSama.getTomes().size() + " tomes en cours d'?dition\n");
		
		
		Projet projetWebFic = new ProjetDirector(new ProjetBuilderQuebec(2)).setTitre("WebFic").build();
		
		System.out.println("Projet " + projetWebFic.getTitre() + " cr?? avec succ?s");
		System.out.println("Equipe compos?e de " + projetWebFic.getEquipe().getPersonnes().size() + " personnes");
		System.out.println("Actuellement " + projetWebFic.getTomes().size() + " tomes en cours d'?dition");
		System.out.println(projetWebFic.toString());
		
		
		Projet projetIdolish = new ProjetDirector(new ProjetBuilderJapon()).setTitre("Idolish7").build();
		
		System.out.println("Projet " + projetIdolish.getTitre() + " cr?? avec succ?s");
		System.out.println("Equipe compos?e de " + projetIdolish.getEquipe().getPersonnes().size() + " personnes");
		projetIdolish.ajouterTome(new Tome("Monster Generation"));
		projetIdolish.ajouterTome(new Tome("Trigger"));
		projetIdolish.ajouterTome(new Tome("Riku et Tenn"));
		System.out.println("Actuellement " + projetIdolish.getTomes().size() + " tomes en cours d'?dition :");
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
		System.out.println("Commentaire: Planche corrig?e");
		plancheC.state();
		System.out.println("\n");
		
		//Planche retouch?e
		Planche plancheR = new PlancheRetouchee(plancheC);
		System.out.println("Commentaire: Planche retouch?e");
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
