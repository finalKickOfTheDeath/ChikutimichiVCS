package serie;

import java.util.ArrayList;
import java.util.List;

public class Tome {

	private int numero;
	private String titre;
	private List<Chapitre> chapitres;
	private List<Illustration> illustrations;
	
	public Tome(String titre) {
		this.titre = titre;
		chapitres = new ArrayList<Chapitre>();
		illustrations = new ArrayList<Illustration>();
	}

	public void ajouterChapitre(Chapitre chapitre) {
		chapitre.setNumero(getNextNum());
		chapitres.add(chapitre);
	}
	
	public void ajouterIllustration(Illustration illustration) {
		illustrations.add(illustration);
	}
	
	private int getNextNum() {
		if(chapitres.isEmpty()) {
			return 1;
		}
		else return chapitres.size() + 1;
	}

	public String getTitre() {
		return titre;
	}
	
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public List<Chapitre> getChapitre() {
		return chapitres;
	}
	
	@Override
	public String toString() {
		return "Tome " + getNumero() + ": " + getTitre();
	}

}
