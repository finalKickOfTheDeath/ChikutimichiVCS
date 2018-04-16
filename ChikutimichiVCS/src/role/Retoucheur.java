package ChikutimichiVCS.src.role;

public class Retoucheur extends Personne {
	
	public Retoucheur() {
		super();
	}

	@Override
	public void traitement(String probleme) {
		if (probleme.equals("visuel etrange")){
			System.out.println("Modification des bulles");
		}else
			this.suceessor.traitement(probleme);
	}
}
