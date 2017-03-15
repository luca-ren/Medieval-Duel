import java.io.*;
import java.util.*;

public class LivreCapacite {
    private Capacite listCapacite[];
    public LivreCapacite() {
    	this.init();
    }
    	
    public void init(){
        try
        {
            File f = new File ("Sauvegarde/LivreCapacite.txt");
            Scanner scan = new Scanner (f);
            listCapacite = new Capacite[20];
            String type;
            String nom;
            int imp;
            int man;
            int pro;
            int pui;
            int fac;
            
            for (int i = 0; i < 20;){
            	
                while (true)
                {
                	
                    try
                    {   	
                        type = scan.nextLine();
                        
                        if (type.equals("Arme")){
                            nom = scan.nextLine();
                            imp = scan.nextInt();
                            man = scan.nextInt();
                            listCapacite[i] = new Arme(nom,imp,man);
                            i++;
                        }
                        
                        else if(type.equals("Bouclier")){
                            nom = scan.nextLine();
                            pro = scan.nextInt();
                            man = scan.nextInt();
                            listCapacite[i] = new Bouclier(nom,pro,man);
                            i++;
                        }
                        
                        else if(type.equals("Remede")){
                            nom = scan.nextLine();
                            pui = scan.nextInt();
                            fac = scan.nextInt();
                            listCapacite[i] = new Remede(nom,pui,fac);
                            i++;
                        }
                        
                        else if(type.equals("SortAtt")){
                            nom = scan.nextLine();
                            pui = scan.nextInt();
                            fac = scan.nextInt();
                            listCapacite[i] = new SortAtt(nom,pui,fac);
                            i++;
                        }
                        
                        else if(type.equals("SortDef")){
                            nom = scan.nextLine();
                            pui = scan.nextInt();
                            fac = scan.nextInt();
                            listCapacite[i] = new SortDef(nom,pui,fac);
                            i++;
                        }
                        
                        else if(type.equals("SortSoin")){
                            nom = scan.nextLine();
                            pui = scan.nextInt();
                            fac = scan.nextInt();
                            listCapacite[i] = new SortSoin(nom,pui,fac);
                            i++;
                        }
                        
                    }
                    catch (NoSuchElementException exception)
                    {
                        break;
                    }
                }
            }
            
        scan.close();
        }
        catch (FileNotFoundException exception)
        {
            System.out.println ("Le fichier n'a pas ete trouve");
        }
    }
    
    public Capacite getCapacite(int i) {
        return this.listCapacite[i];
    }
    
    public Capacite getCapacite(String nom) {
        for (int i = 0; i < 20 ; i ++){
        	if (nom.equals(listCapacite[i].getNom())){
        		return listCapacite[i];
        	}	
        }
        return listCapacite[0];
    }
    
}
