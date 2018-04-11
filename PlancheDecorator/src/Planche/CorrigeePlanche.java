package Planche;

public class CorrigeePlanche extends PlancheDecorator{

	public CorrigeePlanche(Planche p) {
		super(p);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void state(){
		super.state();
		System.out.print(", Corrigée");
	}

}
