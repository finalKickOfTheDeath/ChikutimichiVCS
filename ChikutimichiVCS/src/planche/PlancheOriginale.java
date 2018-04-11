package planche;

public class PlancheOriginale implements Planche {
	
	@Override
	public void state(){
		System.out.print("Planche Originale");
	}

	@Override
	public void commenter() {
		/*DEBUG*/
		System.out.println("Planche originale commentée");
	}
	
}
