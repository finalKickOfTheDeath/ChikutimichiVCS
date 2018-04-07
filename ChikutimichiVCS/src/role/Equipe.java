package role;

import java.util.ArrayList;
import java.util.List;

public class Equipe {
	
	private List<Personne> equipe;
	
	public Equipe() {
		equipe = new ArrayList<Personne>();
	}
	
	public void creerEquipeMangaEtranger() {
		equipe.add(new Directeur());
		equipe.add(new Editeur());
		equipe.add(new Auteur());
		equipe.add(new Traducteur());
		equipe.add(new Correcteur());
		equipe.add(new Retoucheur());
		equipe.add(new Illustrateur());
		equipe.add(new ResponsableFabrication());
		/*DEBUG*/
		System.out.println("Equipe pour la traduction d'un manga étranger créée");
	}
	
	public void creerEquipeMangaQuebec() {
		equipe.add(new Directeur());
		equipe.add(new Editeur());
		equipe.add(new Auteur());
		equipe.add(new Correcteur());
		equipe.add(new ResponsableFabrication());
		/*DEBUG*/
		System.out.println("Equipe pour la publication d'un manga québécois créée");
	}
	
	public void ajouterPersonne(Personne personne) {
		equipe.add(personne);
	}
	
	public void retirerPersonne(Personne personne) {
		equipe.remove(personne);
	}

}
