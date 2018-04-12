package serie;

import java.util.ArrayList;
import java.util.List;

import planche.Planche;

public class Chapitre {
	
	private int numero;
	private List<Planche> planches;
	
	public Chapitre() {
		planches = new ArrayList<Planche>();
	}
	
	public void ajouterPlanche(Planche planche) {
		planches.add(planche);
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		return "  Chapitre " + getNumero();
	}

}
