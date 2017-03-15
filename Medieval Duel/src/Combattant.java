
public class Combattant {
	
    private String nom;
    
    private int force;

    private int dex;

    private int intel;

    private int con;

    private int vit;

    private int exp;

    private int nbCap;

    public static final int EXPMIN = 1;

    public static final int EXPMAX = 20;

    private Capacite[] listCapacite = new Capacite[9];
    
    public Combattant(String n){
    	this.nom = n;
    }
    
    public Combattant(String n, int force, int dex, int intel, int conconcentration) {
        this.nom     =   n;
        this.force   =   force;
        this.dex     =   dex;
        this.intel   =   intel;
        this.con     =   conconcentration;
        this.setVit();
        this.exp     =   1;
        this.nbCap   =   0;
    }

    public Combattant(String n, int force, int dex, int intel, int conconcentration, Capacite cap1, Capacite cap2) {
        this.nom     =   n;
        this.force   =   force;
        this.dex     =   dex;
        this.intel   =   intel;
        this.con     =   conconcentration;
        this.setVit();
        this.exp     =   1;
        this.nbCap   =   0;
        this.setCapacite(cap1);
        this.setCapacite(cap2);
    }

    public Combattant(String n,int force, int dex, int intel, int concentration,int exp,Capacite[] listeCapacite, int nbCap){
        this.nom     =   n;
        this.force   =   force;
        this.dex     =   dex;
        this.intel   =   intel;
        this.con     =   concentration;
        this.setVit();
        this.exp     =   exp;
        this.nbCap   =   0;
        this.setCapacite(listeCapacite,nbCap);    
    }
    
    
    public Combattant(Combattant combattant){
        this.nom     =   combattant.getNom();
        this.force   =   combattant.getFor();
        this.dex     =   combattant.getDex();
        this.intel   =   combattant.getIntel();
        this.con     =   combattant.getCon();
        this.setVit();
        this.exp     =     1;
        this.nbCap   =    0;
        for(int i = 0; i < combattant.getNbCap(); i++){
        	this.setCapacite(combattant.listCapacite[i]);
        }
        
    }
    
    public String getNom() {
        return this.nom;
    }

    public void setNom(String n) {
        this.nom = n;
    }

    public int getFor() {
        return this.force;
    }

    public void setFor(int fOR) {
        this.force = fOR;
    }

    public int getDex() {
        return this.dex;
    }

    public void setDex(int dext) {
        this.dex = dext;
    }

    public int getIntel() {
        return this.intel;
    }

    public void setIntel(int intl) {
        this.intel = intl;
    }

    public int getCon() {
        return this.con;
    }

    public void setCon(int conc) {
        this.con = conc;
    }

    public int getVit() {
        return this.vit;
    }

    public void setVit() {
        this.vit= (200 -(this.force+this.dex+this.intel+this.con)) +((this.exp)*3);
    }
    
    public void setVit(int vit) {
    	this.vit = vit;
        }

    public int getExp() {
        return this.exp;
    }

    public void setExp(int expe) {
        if(expe>=EXPMIN&&expe<=EXPMAX)
            this.exp = expe;
    }

    public int getNbCap() {
        return this.nbCap;
    }

    public void setNbCap(int nbCap) {
        this.nbCap = nbCap;
    }

    public int getNbCapDispo() {
        float nbExp = getExp();
        if(nbExp < 7)
            return 0;
        else
            return (int)((nbExp-1)/2)-getNbCap();
    }

    public void setCapacite(Capacite cap) {
        if (nbCap < 2){
        	if(cap.getType().equals("Arme")){
        		this.listCapacite[nbCap]= new Arme(cap);
        		this.nbCap ++;
        	}	
        	else if(cap.getType().equals("Bouclier")){
        		this.listCapacite[nbCap]= new Bouclier(cap);
        		this.nbCap ++;
        	}
        	else if(cap.getType().equals("Remede")){
        		this.listCapacite[nbCap]= new Remede(cap);
        		this.nbCap ++;
        	}
        	else if(cap.getType().equals("SortAtt")){
        		this.listCapacite[nbCap]= new SortAtt(cap);
        		this.nbCap ++;
        	}
        	else if(cap.getType().equals("SortDef")){
        		this.listCapacite[nbCap]= new SortDef(cap);
        		this.nbCap ++;
        	}
        	else if(cap.getType().equals("SortSoin")){
        		this.listCapacite[nbCap]= new SortSoin(cap);
        		this.nbCap ++;
        	}
        }
    }
    
    public void setCapacite(Capacite[] listeCapacite,int nbCap){
    		this.listCapacite = new Capacite[9];
    		int i;
    		for (i = 0; i < nbCap ; i ++){
    		if(listeCapacite[i].getType().equals("Arme")){
        		this.listCapacite[i]= new Arme(listeCapacite[i]);
        	}	
        	else if(listeCapacite[i].getType().equals("Bouclier")){
        		this.listCapacite[i]= new Bouclier(listeCapacite[i]);
        	}
        	else if(listeCapacite[i].getType().equals("Remede")){
        		this.listCapacite[i]= new Remede(listeCapacite[i]);
        	}
        	else if(listeCapacite[i].getType().equals("SortAtt")){
        		this.listCapacite[i]= new SortAtt(listeCapacite[i]);
        	}
        	else if(listeCapacite[i].getType().equals("SortDef")){
        		this.listCapacite[i]= new SortDef(listeCapacite[i]);
        	}
        	else if(listeCapacite[i].getType().equals("SortSoin")){
        		this.listCapacite[i]= new SortSoin(listeCapacite[i]);
        	}
    		}
    		this.nbCap = nbCap;
    }
    
   public Capacite getCapacite(int i){
	   return listCapacite[i];
   }
    
    public String getClasse(){
    	return "";
    }
    
    public String toString(){
    	return "Nom = "+this.nom+"\n";
    }
}
