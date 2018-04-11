package planche;

public class PlancheTraduite extends PlancheDecorator {
	
	public PlancheTraduite(Planche p) {
		super(p);
	}
	
	@Override
	public void state(){
		super.state();
		System.out.print(", Traduite");
	}
	
}
