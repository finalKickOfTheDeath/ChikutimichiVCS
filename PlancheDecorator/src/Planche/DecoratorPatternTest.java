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
		
		//Planche corrigée
		Planche plancheC = new CorrigeePlanche(plancheT);
		System.out.println("Commentaire :Planche corrigée");
		plancheC.state();
		System.out.println("\n*****");
		
		//Planche retouchée
		Planche plancheR = new PlancheRetouchee(plancheC);
		System.out.println("Commentaire :Planche retouchée");
		plancheR.state();
	}
}
