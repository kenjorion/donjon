package donjon;

public class Tresor extends Salle{

	public int type = 2; 
	public int butin = 2; 
	public int etage; 
	public int etat2 = 2;
	
	public String etat(User jojo) 
	{ 
		return "Vous êtes dans une salle au trésor et vous avez" +jojo.butin  +"points donc vous avancez" ;
	}
}
