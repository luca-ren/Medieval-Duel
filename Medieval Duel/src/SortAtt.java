
public class SortAtt extends Sort {
    public static final String TYPE = "SortAtt";

    public static String categorie = "Attaque";

    public SortAtt(String s, int pui, int fac) {
        super(s,pui,fac);
    }
    
    public SortAtt(Capacite cap) {
        super(cap);
    }

    public String getType(){
    	return super.getType()+SortAtt.TYPE;
    }
    
    public String toString(){
    	return super.toString()+SortAtt.TYPE+"\nPuissance = "+this.getPui()+"\nFaculte= "+
    			this.getFac()+"\n";
    }
}
