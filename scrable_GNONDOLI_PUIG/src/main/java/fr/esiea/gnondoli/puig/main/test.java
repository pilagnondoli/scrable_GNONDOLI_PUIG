package fr.esiea.gnondoli.puig.main;

import java.util.Scanner;
import fr.esiea.gnondoli.puig.joueur.Joueur;
import fr.esiea.gnondoli.puig.pot_commun.PotCommun;

public class test {
	private static Scanner taille_MV;

	public static void main(String[] args) {
		//test du bag
		//Bag.GetALetter();
		String word;
		
		PotCommun.DebutDeTour();
		PotCommun.MotReussi();
		PotCommun.PrintTas();
		do{ 
			taille_MV = new Scanner(System.in); 
			word = taille_MV.nextLine();
		}while(word == "");
		Joueur.TestMots(word);
		Joueur.PrintJoueurMots();
		PotCommun.PrintTas();
	}
	
}
