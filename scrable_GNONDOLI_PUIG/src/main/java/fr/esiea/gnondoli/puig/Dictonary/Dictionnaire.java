package fr.esiea.gnondoli.puig.Dictonary;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Dictionnaire {
	static boolean MotVerif=false;
	public static boolean LectureFichier(String MotTest){
		String chaine="";
		String fichier ="src/main/ressources/dico.txt";
		MotVerif=false;
		//lecture du fichier texte	
		try{
			InputStream ips=new FileInputStream(fichier); 
			InputStreamReader ipsr=new InputStreamReader(ips);
			BufferedReader br=new BufferedReader(ipsr);
			String ligne;
			//test de mots
			do{
				while ((ligne=br.readLine())!=null){
					chaine=ligne;
					if(chaine.equals(MotTest)){
						MotVerif=true;
						System.out.println("le mot existe");
					}
				}				
			}while( MotVerif == false );
			
			br.close(); 
		}		
		catch (Exception e){
			System.out.println(e.toString());
		}
		return MotVerif;
	}

}
