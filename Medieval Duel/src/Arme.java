
public class Arme extends Capacite {

    private int imp;

    private int man;

    public static final String TYPE = "Arme";

    public static final String  CATEGORIE1 = "Attaque";
    public static final String  CATEGORIE2 = "Defense";

    public Arme(String s, int imp, int man) {
        super(s);
        this.imp =(imp);
        this.man =(man);
    }
    
    public Arme(Capacite cap){
    	super(cap.getNom());
    	this.imp =cap.getImp();
    	this.man = cap.getMan();
    }

    public int getImp() {
        return imp;
    }

    public void setImp(int imp) {
        this.imp = imp;
    }

    public int getMan() {
        return man;
    }

    public void setMan(int man) {
        this.man = man;
    }

    public float getPbaAtt(Combattant combattant){
    	return (combattant.getDex()*this.getMan())/10000;
    }


    public float getPbaDef(Combattant combattant){
    	return (combattant.getDex()*this.getMan())/5000;
    }

    public float getEffAtt(Combattant combattant){
    	float effAtt = (combattant.getFor()*this.getImp())/100;
    	float pourcentage= (effAtt*25)/100;
    	float pbaMax= effAtt+pourcentage;
    	float pbaMin= effAtt-pourcentage;
    	return pbaMin + (float)(Math.random() * ((pbaMax - pbaMin) + 1));	
    }

    public float getEffDef(Combattant combattant){
    	float effDef = (combattant.getFor()*this.getImp())/50;
    	float pourcentage= (effDef*25)/100;
    	float pbaMax= effDef+pourcentage;
    	float pbaMin= effDef-pourcentage;
    	return (pbaMin + (float)(Math.random() * ((pbaMax - pbaMin) + 1)));	
    }

    public String getType(){
    	String s = "";
    	return s+super.getType()+Arme.TYPE;
    }

    public String getCategorie1(){
    	return Arme.CATEGORIE1;
    }
    public String getCategorie2(){
    	return Arme.CATEGORIE2;
    }
    
    public String toString(){
    	return super.toString()+Arme.TYPE+"\nImpact = "+this.getImp()+"\nManiabilite = "+
    			this.getMan()+"\n";
    }
}
