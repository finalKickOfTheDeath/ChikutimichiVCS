package Planche;

public class DecoratorPatternTest {
	public static void main(String[] args){
		
		//Planche originale
		Planche plancheO = new PlancheOriginale();
		
		//Planche traduite
		Planche plancheT = new PlancheTraduite(plancheO);
		System.out.println("Commentaire :Planche traduite");
		plancheT.state();
		System.out.println("\n*****");
		
		//Planche corrig�e
		Planche plancheC = new CorrigeePlanche(plancheT);
		System.out.println("Commentaire :Planche corrig�e");
		plancheC.state();
		System.out.println("\n*****");
		
		//Planche retouch�e
		Planche plancheR = new PlancheRetouchee(plancheC);
		System.out.println("Commentaire :Planche retouch�e");
		plancheR.state();
	}
}
