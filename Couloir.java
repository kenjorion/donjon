package donjon;

public class Couloir implements donjon{

	String saisie;
	public int etage; 
	public int etat2 = 1; // le joueur est dans le couloir
	

	public String etat(User jojo) 
		{ 	
			return "Tu es dans dans le couloir";
		}
}
