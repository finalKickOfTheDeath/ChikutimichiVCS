package planche;

public class PlancheCorrigee extends PlancheDecorator {

	public PlancheCorrigee(Planche p) {
		super(p);
	}
	
	@Override
	public void state() {
		super.state();
		System.out.print(", Corrigée");
	}

}
