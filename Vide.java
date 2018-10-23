package donjon;

public class Vide extends Salle
{
	public int type = 1; 
	public int butin = 0; 
	public int etage; 
	public int etat2 = 2;
	
	
	public String etat(User jojo) 
	{ 
		return "Vous êtes dans une salle vide et vous avez" +jojo.butin + "donc vous avancez" ;
	}
}
