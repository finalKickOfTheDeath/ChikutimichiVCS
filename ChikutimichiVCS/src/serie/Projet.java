package serie;

import java.util.ArrayList;
import java.util.List;

import role.Equipe;

public class Projet {
	
	private String titre;
	private List<Tome> tomes;
	private Equipe equipe;
	
	public Projet(String titre) {
		this.setTitre(titre);
		tomes = new ArrayList<Tome>();
	}
	
	public void ajouterTome(Tome tome) {
		tomes.add(tome);
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	public List<Tome> getTomes() {
		return tomes;
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}

}
