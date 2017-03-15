public class Guerrier extends Combattant {

	public static final String CLASSE = "Guerrier";
	
	public Guerrier(String nom,int force,int dex,int intel, int concentration,Capacite cap1,Capacite cap2){
		super(nom,force,dex,intel,concentration,cap1,cap2);
	}
	
	public Guerrier(String nom,int force,int dex,int intel, int concentration){
		super(nom,force,dex,intel,concentration);
	}
	
	public Guerrier(String nom,int force, int dex, int intel, int concentration,int exp,Capacite[] listCapacite,int nbCap){
		super(nom,force,dex,intel,concentration,exp,listCapacite,nbCap);
	}
	
	public Guerrier(Combattant combattant){
		super(combattant);
	}
	
	public String getClasse(){
		return Guerrier.CLASSE;
	}
	
	public String toString(){
		String s = "";
		s = s +"Nom = "+super.getNom()+"\nClasse = "+Guerrier.CLASSE+"\nVie ="
				+ super.getVit()+"\nForce = "+super.getFor()+"\nDexterite = "
				+ super.getDex()+"\nIntel = "+ super.getIntel()+"\nConstitution = "
				+ super.getCon()+"\nExp = "+super.getExp()+"/20\n";
		for (int i = 0; i < super.getNbCap(); i ++){
			s = s + super.getCapacite(i).toString();
		}
		return s;
	}
}
