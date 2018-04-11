package Planche;

public class PlancheTraduite extends PlancheDecorator{
	public PlancheTraduite(Planche p) {
		super(p);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void state(){
		super.state();
		System.out.print(", Traduite");
	}
}
