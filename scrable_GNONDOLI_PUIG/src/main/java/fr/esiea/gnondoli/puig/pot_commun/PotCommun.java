package fr.esiea.gnondoli.puig.pot_commun;


import java.util.ArrayList;
import java.util.Iterator;

import fr.esiea.gnondoli.puig.bag.Bag;

public class PotCommun extends Bag{
	public static ArrayList<String> tas = new ArrayList<String>();
	
	public static void DebutDeTour(){
		tas.add(Bag.GetALetter());
		tas.add(Bag.GetALetter());
	}
	
	public static void MotReussi(){
		tas.add(Bag.GetALetter());
	}
	
	public static void PrintTas(){
		Iterator<String> it = tas.iterator();
		 while(it.hasNext()){
		 	
		 	System.out.println(it.next());
		 }
	}
	
	
	
}
