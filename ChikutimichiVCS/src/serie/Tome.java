package serie;

import java.util.ArrayList;
import java.util.List;

public class Tome {
	
	private static int cpt = 0;
	
	private int numero;
	private String titre;
	private List<Chapitre> chapitres;
	private List<Illustration> illustrations;
	
	public Tome(String titre) {
		this.numero = ++cpt;
		this.titre = titre;
		chapitres = new ArrayList<Chapitre>();
		illustrations = new ArrayList<Illustration>();
	}

	public void ajouterChapitre(Chapitre chapitre) {
		chapitres.add(chapitre);
	}
	
	public void ajouterIllustration(Illustration illustration) {
		illustrations.add(illustration);
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

}
