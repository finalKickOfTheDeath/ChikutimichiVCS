package ChikutimichiVCS.src.role;

import java.util.ArrayList;
import java.util.List;

public class Equipe {
	
	private List<Personne> personnes;
	
	public Equipe() {
		personnes = new ArrayList<Personne>();
	}
	
	public Equipe creerEquipeJapon() {
		personnes.add(new Directeur());
		personnes.add(new Editeur());
		personnes.add(new Auteur());
		personnes.add(new Traducteur());
		personnes.add(new Correcteur());
		personnes.add(new Retoucheur());
		personnes.add(new Illustrateur());
		personnes.add(new ResponsableFabrication());
		return this;
	}
	
	public Equipe creerEquipeQuebec() {
		personnes.add(new Directeur());
		personnes.add(new Editeur());
		personnes.add(new Auteur());
		personnes.add(new Correcteur());
		personnes.add(new ResponsableFabrication());
		return this;
	}
	
	public void ajouterPersonne(Personne personne) {
		personnes.add(personne);
	}
	
	public void retirerPersonne(Personne personne) {
		personnes.remove(personne);
	}
	
	public List<Personne> getPersonnes() {
		return personnes;
	}

}
