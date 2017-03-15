
public class Mage extends Combattant {

	public static final String CLASSE = "Mage";
	
	public Mage(String nom, int force, int dex, int intel,int concentration,Capacite cap1,Capacite cap2) {
		super(nom,force,dex,intel,concentration,cap1,cap2);
	}
	
	public Mage(String nom, int force, int dex, int intel,int concentration) {
		super(nom,force,dex,intel,concentration);
	}
	
	public Mage(String nom,int force, int dex, int intel, int concentration,int exp,Capacite listCapacite[],int nbCap){
		super(nom,force,dex,intel,concentration,exp,listCapacite,nbCap);
	}
	
	public Mage(Combattant combattant){
		super(combattant);
	}

	public int maxForceDex(){
		if (super.getFor() >= super.getDex())
			return super.getFor();
		else
			return super.getDex();
	}
	
	public String getClasse(){
		return Mage.CLASSE;
	}
	public String toString(){
		String s = "";
		s = s +"Classe = "+Guerrier.CLASSE+"\nVie ="
				+ super.getVit()+"\nForce = "+super.getFor()+"\nDexterite = "
				+ super.getDex()+"\nIntel = "+ super.getIntel()+"\nConstitution = "
				+ super.getCon()+"\nExp = "+super.getExp()+"/20\n";
		for (int i = 0; i < super.getNbCap(); i ++){
			s = s + super.getCapacite(i).toString();
		}
		return s;
	}
}

