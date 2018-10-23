package donjon;
import java.util.Scanner; 
import java.util.Random;


public class Main {

	public void main(String[] args) 
	{
		// TODO Auto-generated method stub
		User joueur = new User(); 
		String saisie;
		
		
		//R�gles du jeu
		System.out.println("Bienvenue dans le donjon, voici comment �a se d�roule"); 
		System.out.println("Il y a 3 �tages, si le joueur survit dans les 3 salles � chaque �tage il a gagn�"); 
		System.out.println("Il faut avoir plus d'argent que l'ennemi pour le batre et rester vivant"); 
		System.out.println("Tu es dans un couloir et tu choisis de rentrer dans la salle pour continuer � avancer ou abandonner.");
		System.out.println("Tu peux aussi faire demi-tour que dans les couloirs !");
		System.out.println("\t Pour aller avancer appuie C (en majuscule)");
		System.out.println("\t Pour arr�ter utilise F (en majuscule)"); 
		System.out.println("Bonne chance ! \n");
	

	int etage = 1;
	int piece;
	
	if (joueur.EstVivant() == true) 
	{
			this.Couloir(joueur); 
			
			Random al�atoire = new Random();
			piece = al�atoire.nextInt(3);
		
				if(piece == 1) 
				{ //entre dans une salle au vide
				Vide vide = new Vide();  
				joueur.etat2 = vide.etat2; 
				this.etat(joueur);
				} 
				
				if(piece == 2) //entre dans une salle de tresor
				{ 
					Tresor tresor = new Tresor(); 
					joueur.prendre(tresor.butin);
					joueur.etat2 = tresor.etat2; 
					etat(joueur);
				}	
				
				if(piece == 3) //entre dans une salle ennemi
				{ 
					Ennemi ennemi = new Ennemi(); 
					if (ennemi.butin > joueur.butin )
					{ 
						ennemi.prendre(joueur.butin); 
					} 
					else 
					{ 
						joueur.prendre(ennemi.butin);
					}
					System.out.println("Il reste" + joueur.butin +" points au joueur");
				}			
				
	} 
	else 
	{ 
		System.out.println("Game over, vous �tes mort");
		nouvellePartie(saisie);
	}
	
	


	private void Couloir(User joueur) 
	{
		String saisie;
		// TODO Auto-generated method stub
		do 
		{
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Tu continues (C) ou tu t'arr�tes (F) ?");
			saisie = keyboard.nextLine();
		}  
		
		while(!saisie.equals("C") && !saisie.equals("F"));
	
		if(saisie.equals("F")) 
		{
			System.out.println("Game Over ! Tu t'arr�tes avec " + joueur.butin +" points \n");
		} 
		
		else if(saisie.equals("C)")) 
		{ 
			//le joueur rentre dans la salle 
			joueur.etat2 = 2;
		}
	
	}
	
	public static void nouvellePartie(String saisie) {
		//Propose une nouvelle partie
		do {
			// La saisie du code du joueur
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Souhaitez vous refaire une partie ? (OUI/NON)");
			saisie = keyboard.nextLine();
    	} while(!saisie.equals("OUI") && !saisie.equals("NON") && !saisie.equals("ok") && !saisie.equals("non"));
  	
		if(saisie.equals("OUI") || saisie.equals("ok")) {
			System.out.println("Bonne chance !!");
			main(null);
		} else { System.out.println("Aurevoir !"); }
	}
} 


