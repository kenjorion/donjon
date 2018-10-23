package donjon;

public class User implements Perso{

	public int butin = 2; // butin de base
	public String nom = "user"; 
	public int etat2;
	
	
	public int prendre(int gain)
	{ 
		this.butin = this.butin + gain ; 
		return this.butin; 
	} 
	
	public int donner (int perte) 
	{ 
		this.butin = this.butin - perte; 
		return this.butin; 
	} 
	
	public boolean EstVivant() 
	{ 
		boolean envie = true;
		if ( this.butin == 0 ) 
		{ 
			envie = false;
		} 
		return envie; 
	}
}
