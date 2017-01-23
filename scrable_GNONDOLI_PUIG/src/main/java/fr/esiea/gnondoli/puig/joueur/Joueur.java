package fr.esiea.gnondoli.puig.joueur;

import java.util.ArrayList;
import java.util.Iterator;

import fr.esiea.gnondoli.puig.Dictonary.Dictionnaire;
import fr.esiea.gnondoli.puig.pot_commun.PotCommun;

public class Joueur {
	
	protected static ArrayList<String> MotTest = new ArrayList<String>();	
	protected static ArrayList<String> LettresTasTest = new ArrayList<String>();
	protected static ArrayList<String> Mots = new ArrayList<String>();
	static boolean MotValide = true;
	
	public static void TestMots(String MotSelect){
		boolean MotExist=Dictionnaire.LectureFichier(MotSelect);
		if(MotExist==true){
			String[] TestMot=MotSelect.split("");
			boolean letterfound = false;
			for(int i=0;i<PotCommun.tas.size();i++){
				LettresTasTest.add(PotCommun.tas.get(i));
			}
			int i=0;
			while(i< TestMot.length){
				int j=0;
				letterfound = false;
				do{
					if (TestMot[i].equals(LettresTasTest.get(j)) && letterfound ==false ){
						//System.out.println("remove : "+LettresTasTest.get(j));
						LettresTasTest.remove(j);
						letterfound = true;
					}
					j++;
					//System.out.println("lettre choisi : "+ TestMot[i]+ ", "+j);
				}while(j<LettresTasTest.size());
				if (letterfound ==false){
					//System.out.println("mot impossible: "+MotSelect);
					for (int k=0;k<LettresTasTest.size();k++){
						LettresTasTest.remove(k);
					}
					for (int k=0;k<MotTest.size();k++){
						MotTest.remove(k);
					}
					MotValide=false;
				}
				i++;	
			}
			if(MotValide==true){
				for (int k=0;k<LettresTasTest.size();k++){
					LettresTasTest.remove(k);
				}
				for (int k=0;k<MotTest.size();k++){
					MotTest.remove(k);
					
				}
				Mots.add(MotSelect);
				SupprimerLettretas(MotSelect);
			}
		}		
	}
	
	public static void SupprimerLettretas(String try2){
		String[] lettresupp=try2.split("");
		for(int i=0;i<lettresupp.length;i++){
			int j=0;
			boolean letterfound2 = false;
			do{
				if (lettresupp[i].equals(PotCommun.tas.get(j)) && letterfound2 ==false){
					PotCommun.tas.remove(j);
					letterfound2 = true;
				}
				j++;
			}while(j<PotCommun.tas.size());			
		}
	}
	
	public static void PrintJoueurMots(){
		Iterator<String> it = Mots.iterator();
		 while(it.hasNext()){
		 	
		 	System.out.println(it.next());
		 }
		 System.out.println("\n");
	}
	
}
