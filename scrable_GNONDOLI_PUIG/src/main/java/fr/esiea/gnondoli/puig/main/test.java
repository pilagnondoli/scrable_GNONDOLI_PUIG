package fr.esiea.gnondoli.puig.main;

import java.util.Scanner;

import fr.esiea.gnondoli.puig.joueur.Joueur;
//import fr.esiea.gnondoli.puig.bag.Bag;
import fr.esiea.gnondoli.puig.pot_commun.PotCommun;

public class test {
	private static Scanner taille_MV;

	public static void main(String[] args) {
		//test du bag
		//Bag.GetALetter();
		String lettrepris;
		
		PotCommun.DebutDeTour();
		PotCommun.MotReussi();
		PotCommun.PrintTas();
		do{ 
			taille_MV = new Scanner(System.in); 
			lettrepris = taille_MV.nextLine();
		}while(lettrepris == "");
		Joueur.TestMots(lettrepris);
		Joueur.PrintJoueurMots();
		PotCommun.PrintTas();
	}
	
}
