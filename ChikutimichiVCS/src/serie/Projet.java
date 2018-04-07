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
		System.out.println("Nouveau projet " + getTitre() + " cr��");
	}

	public void ajouterTome(Tome tome) {
		tomes.add(tome);
		/*DEBUG*/
		System.out.println("Tome ajout� � la s�rie");
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
