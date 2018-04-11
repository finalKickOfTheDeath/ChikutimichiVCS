package Planche;

public class PlancheRetouchee extends PlancheDecorator{

	public PlancheRetouchee(Planche p) {
		super(p);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void state(){
		super.state();
		System.out.print(", Retouchée");
	}

}
