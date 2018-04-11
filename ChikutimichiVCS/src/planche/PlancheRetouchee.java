package planche;

public class PlancheRetouchee extends PlancheDecorator {

	public PlancheRetouchee(Planche p) {
		super(p);
	}
	
	@Override
	public void state(){
		super.state();
		System.out.print(", Retouchée");
	}

}
