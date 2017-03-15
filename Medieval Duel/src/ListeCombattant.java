import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ListeCombattant {

	public static final int MAXCOMB = 6;
    
    private int nbComb;

    private Combattant listCombattant[] = new Combattant[MAXCOMB];
    
    public ListeCombattant() throws IOException{
    	this.init();
    }
    public void supprimerCombattant(int i){

		try {
	    	FileWriter f = new FileWriter ("Sauvegarde/Slot"+(i)+".txt",false);
			PrintWriter pWriter = new PrintWriter (f);
			pWriter.print("");
			pWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    public void sauvegarderCombattant(Combattant combattant,int i) throws IOException{
    		i++;
    		FileWriter f = new FileWriter ("Sauvegarde/Slot"+i+".txt",false);
			PrintWriter pWriter = new PrintWriter (f);
			String type;
			String s =  System.getProperty("line.separator");
			if(combattant.getClasse().equals("Guerrier")){
				pWriter.print(combattant.getNom()+s+combattant.getClasse()+s+combattant.getFor()+" "+combattant.getDex()+" "+
						combattant.getIntel()+" "+combattant.getCon()+" "+combattant.getExp()+" "+combattant.getNbCap()+s);
				for (int j = 0; j < combattant.getNbCap(); j ++){
                    type = combattant.getCapacite(j).getType();
                    if (type.equals("Arme") || type.equals("Bouclier")){
                    	pWriter.print(type+s+combattant.getCapacite(j).getNom()+s+
    					combattant.getCapacite(j).getImp()+" "+combattant.getCapacite(j).getMan()+s);
                    }
                    else {
                    	pWriter.print(type+s+combattant.getCapacite(j).getNom()+s+
    					combattant.getCapacite(j).getPui()+" "+combattant.getCapacite(j).getFac()+s);
                    }
				}
			}
			else if(combattant.getClasse().equals("Mage")){
				pWriter.print(combattant.getNom()+s+combattant.getClasse()+s+combattant.getFor()+" "+combattant.getDex()+" "+
						combattant.getIntel()+" "+combattant.getCon()+" "+combattant.getExp()+" "+combattant.getNbCap()+s);
				for (int j = 0; j < combattant.getNbCap(); j ++){
                    type = combattant.getCapacite(j).getType();
                    
                    if (type.equals("Arme") || type.equals("Bouclier")){
                    	pWriter.print(combattant.getCapacite(j).getType()+s+combattant.getCapacite(j).getNom()+s+
    					combattant.getCapacite(j).getImp()+" "+combattant.getCapacite(j).getMan()+s);
                    }
                    
                    else {
                    	pWriter.print(combattant.getCapacite(j).getType()+s+combattant.getCapacite(j).getNom()+s+
    					combattant.getCapacite(j).getPui()+" "+combattant.getCapacite(j).getFac()+s);
                    }
				}
			}
			else if(combattant.getClasse().equals("Chasseur")){
				pWriter.print(combattant.getNom()+s+combattant.getClasse()+s+combattant.getFor()+" "+combattant.getDex()+" "+
						combattant.getIntel()+" "+combattant.getCon()+" "+combattant.getExp()+" "+combattant.getNbCap()+s);
				for (int j = 0; j < combattant.getNbCap(); j ++){
                    type = combattant.getCapacite(j).getType();
                    
                    if (type.equals("Arme") || type.equals("Bouclier")){
                    	pWriter.print(combattant.getCapacite(j).getType()+s+combattant.getCapacite(j).getNom()+s+
    					combattant.getCapacite(j).getImp()+" "+combattant.getCapacite(j).getMan()+s);
                    }
                    
                    else {
                    	pWriter.print(combattant.getCapacite(j).getType()+s+combattant.getCapacite(j).getNom()+s+
    					combattant.getCapacite(j).getPui()+" "+combattant.getCapacite(j).getFac()+s);
                    }
				}
			}
			pWriter.close();
        
    }
    public Combattant chargerCombattant(String nom){
    	for (int i = 0; i < nbComb; i ++){
    		if(listCombattant[i].getNom().equals(nom))
    			return listCombattant[i];
    	}
    	return listCombattant[0];
    }
    
    public void init() throws IOException{
        String classe;
        String nomCombattant;
        String nomSort = "";
        String jeter;
        int force;
        int dex;
        int intel;
        int concentration;
        int exp;
        int nbCap;
        String type;
        int imp=0;
        int man=0;
        int pui=0;
        int fac=0;
        int pro=0;
        Capacite listCapacite[]; 
        File f;
        Scanner scan;
        for (int i = 0; i < MAXCOMB;i++){
        	try
        	{
        		f = new File ("Sauvegarde/Slot"+(i+1)+".txt");
        		scan = new Scanner(f);
        		while (true)
        		{
        			try
        			{
            		 nomCombattant = scan.nextLine();
            		 classe = scan.nextLine();
            		 force = scan.nextInt();
            		 dex = scan.nextInt();
            		 intel = scan.nextInt();
            		 concentration = scan.nextInt();
            		 exp = scan.nextInt();
            		 nbCap = scan.nextInt();
            		 jeter = scan.nextLine();
            		 listCapacite = new Capacite[nbCap];
            		 for (int j = 0; j < nbCap; j ++){
            			 type = scan.nextLine();
            			 if (type.equals("Arme")){
            				 nomSort = scan.nextLine();
            				 imp = scan.nextInt();
            				 man = scan.nextInt();
            				 jeter = scan.nextLine();
            				 listCapacite[j] = new Arme(nomSort,imp,man);
            			 }
            			 else if(type.equals("Bouclier")){
            				 nomSort = scan.nextLine();
            				 pro = scan.nextInt();
            				 man = scan.nextInt();
            				 jeter = scan.nextLine();
            				 listCapacite[j] = new Bouclier(nomSort,pro,man);
            			 }
            			 else if(type.equals("Remede")){
            				 nomSort = scan.nextLine();
            				 pui = scan.nextInt();
            				 fac = scan.nextInt();
            				 jeter = scan.nextLine();
            				 listCapacite[j] = new Remede(nomSort,pui,fac);
            			 }
            			 else if(type.equals("SortAtt")){
            				 nomSort = scan.nextLine();
            				 pui = scan.nextInt();
            				 fac = scan.nextInt();
            				 jeter = scan.nextLine();
            				 listCapacite[j] = new SortAtt(nomSort,pui,fac);
            			 }
            			 else if(type.equals("SortDef")){
            				 nomSort = scan.nextLine();
            				 pui = scan.nextInt();
            				 fac = scan.nextInt();
            				 jeter = scan.nextLine();
            				 listCapacite[j] = new SortDef(nomSort,pui,fac);
            			 }
            			 else if(type.equals("SortSoin")){
            				 nomSort = scan.nextLine();
            				 pui = scan.nextInt();
            				 fac = scan.nextInt();
            				 jeter = scan.nextLine();
            				 listCapacite[j] = new SortSoin(nomSort,pui,fac);
            			 }
            		 }
                            
            		 if (classe.equals("Guerrier")){
            			 listCombattant[i] = new Guerrier(nomCombattant,force,dex,intel,concentration,exp,listCapacite,nbCap);
            		 }	
            		 else if (classe.equals("Mage")){
            			 listCombattant[i] = new Mage(nomCombattant,force,dex,intel,concentration,exp,listCapacite,nbCap);
            		 }
            		 else  if (classe.equals("Chasseur")){
            			 listCombattant[i] = new Chasseur(nomCombattant,force,dex,intel,concentration,exp,listCapacite,nbCap);
            		 }
            		 break;
        			}
        			catch (NoSuchElementException exception)
        			{
        				listCombattant[i] = new Combattant("Vide");
        				break;
        			}
        		}
        	}
        	catch (FileNotFoundException exception)
        	{
        		System.out.println ("Le fichier n'a pas ete trouve");
        		break;
        	}
            scan.close();
        }
    }
    public Combattant getCombattant(int i){
    	return listCombattant[i];
    }
}
