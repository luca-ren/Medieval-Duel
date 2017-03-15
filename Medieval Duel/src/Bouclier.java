
public class Bouclier extends Capacite {
	private int pro;
	private int man;
	public static final String TYPE ="Bouclier";
	public static final String CATEGORIE1 = "Defense";
	public static final String CATEGORIE2 = "Attaque";
	public  Bouclier(String s,int pro,int man){
		
		super(s);
		this.pro = pro;
		this.man = man;
	 }
	
	public Bouclier(Capacite cap){
		
		super(cap.getNom());
		this.pro = cap.getPro();
		this.man = cap.getMan();
	 }


	public int getPro() {
		return this.pro;
	}
	public void setPro(int pro) {
		this.pro = pro;
	}
	public int getMan() {
		return this.man;
	}
	public void setMan(int man) {
		this.man = man;
	}	
	

public float getPbaAtt(Combattant combattant){
	return (combattant.getDex()*this.getMan())/5000;	
}

public float getPbaDef(Combattant combattant){
	return (combattant.getDex()*this.getMan())/10000;
}


public float getEffAtt(Combattant combattant){
	float effAtt = (combattant.getFor()*getPro())/50;
	float pourcentage= (effAtt*25)/100;
	float pbaMax= effAtt+pourcentage;
	float pbaMin= effAtt-pourcentage;
	return pbaMin + (float)(Math.random() * ((pbaMax - pbaMin) + 1));	
}

public float getEffDef(Combattant combattant){
	float effDef = (combattant.getFor()*getPro())/100;
	float pourcentage= (effDef*25)/100;
	float pbaMax= effDef+pourcentage;
	float pbaMin= effDef-pourcentage;
	return (pbaMin + (float)(Math.random() * ((pbaMax - pbaMin) + 1)));	
}

public String getType(){
	return super.getType()+Bouclier.TYPE;
}

public String getCategorie1(){
	return Bouclier.CATEGORIE1;
}
public String getCategorie2(){
	return Bouclier.CATEGORIE2;
}
public String toString(){
	return super.toString()+Bouclier.TYPE+"\nProtection = "+this.getPro()+"\nManiabilite = "+
			this.getMan()+"\n";
}


}

