package serie;

import java.util.ArrayList;
import java.util.List;

import role.Equipe;

public class Projet {
	
	private String titre;
	private List<Tome> tomes;
	private Equipe equipe;
	
	public Projet(String titre) {
		this.titre = titre;
		this.tomes = new ArrayList<Tome>();
		this.equipe = new Equipe();
		/*DEBUG*/
		System.out.println("Nouveau projet " + getTitre() + " créé");
	}

	public void ajouterTome(Tome tome) {
		tomes.add(tome);
		/*DEBUG*/
		System.out.println("Tome ajouté à la série");
	}
	
	public Equipe getEquipe() {
		return equipe;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

}
