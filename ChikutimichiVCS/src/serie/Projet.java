package serie;

import java.util.ArrayList;
import java.util.Iterator;
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
		tome.setNumero(getNextNum());
		tomes.add(tome);
	}
	
	private int getNextNum() {
		if(tomes.isEmpty()) {
			return 1;
		}
		else return tomes.size() + 1;
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
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Iterator<Tome> it = tomes.iterator();
		while(it.hasNext()) {
			Tome t = it.next();
			sb.append(t + "\n");
			if(!t.getChapitre().isEmpty()) {
				Iterator<Chapitre> ic = t.getChapitre().iterator();
				while(ic.hasNext()) {
					Chapitre c = ic.next();
					sb.append(c + "\n");
				}
			}
		}
		return sb.toString();
	}

}
