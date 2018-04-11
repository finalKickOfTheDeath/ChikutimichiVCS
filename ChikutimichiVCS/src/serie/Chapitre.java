package serie;

import java.util.ArrayList;
import java.util.List;

public class Chapitre {
	
	private List<Planche> planches;
	
	public Chapitre() {
		planches = new ArrayList<Planche>();
	}
	
	public void ajouterPlanche(Planche planche) {
		planches.add(planche);
	}

}
