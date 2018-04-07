package serie;

import java.util.ArrayList;
import java.util.List;

public class Tome {
	
	private String titre;
	private List<Chapitre> chapitres;
	
	public Tome() {
		chapitres = new ArrayList<Chapitre>();
	}

	public void ajouterChapitre(Chapitre chapitre) {
		chapitres.add(chapitre);
	}

}
