package planche;

public class PlancheDecorator implements Planche {
	
	protected Planche planche;
	
	public PlancheDecorator(Planche p){
		this.planche = p;
	}
	
	@Override
	public void state(){
		this.planche.state();
	}

	@Override
	public void commenter() {
		/*DEBUG*/
		System.out.println("Planche commentée");
	}
	
}
