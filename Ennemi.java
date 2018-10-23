package donjon;

public class Ennemi extends Salle implements Perso {

	private int type = 3;
	int butin = 3; 
	public int etage;
	User ennemi = new User();  
    this.butin = Salle.butin;
	int etat2 = 2; //le joueur est dans la salle ennemi
	
	public String etat(User jojo) 
	{ 
		return "Vous êtes dans une salle au ennemi  suite au combat vous avez" +jojo.butin  +"points" ;
	}
	
	public int prendre(int gain)
	{ 
		this.butin = this.butin + gain ;  
		ennemi.butin = butin;
		return this.butin; 
	} 
	
	public int donner (int perte) 
	{
		this.butin = this.butin - perte;  
		ennemi.butin = butin;
		return this.butin; 
	}
	
	
	
	public boolean EstVivant() 
	{ 
		boolean envie = true;
		if ( this.butin == 0 || this.butin > ennemi.butin) 
		{ 
			envie = false;
		} 
		return envie; 
	}
	
}
