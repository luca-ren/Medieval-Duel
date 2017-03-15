
public class Capacite {

    public static final int PBAMIN = 0;

    public static final int PBAMAX = 1;
    
    Combattant combattant;
    
    private String nom;

    public Capacite(String nom) {
        this.nom   = new String (nom);
    }
    
    public Capacite(Capacite cap){
    	this.nom = new String(cap.getNom());
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = new String(nom);
    }

    public String toString(){
    	return this.nom+"\n";
    }

    public String getType(){
    	return "";
    }
    
    public int getImp(){
    	return 0;
    }
    
    public int getMan(){
    	return 0;
    }
    
    public int getPui(){
    	return 0;
    }
    
    public int getFac(){
    	return 0;
    }
    
    public int getPro(){
    	return 0;
    }
}
