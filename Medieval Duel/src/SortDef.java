
public class SortDef extends Sort {
	
    public static final String TYPE = "SortDef";

    public static String categorie = "Def";

    public SortDef(String s, int pui, int fac) {
        super(s,pui,fac);
    }
    
    public SortDef(Capacite cap) {
        super(cap);
    }

    public String getType(){
    	return super.getType()+SortDef.TYPE;
    }
    public String toString(){
    	return super.toString()+SortDef.TYPE+"\nPuissance = "+this.getPui()+"\nFaculte = "+
    			this.getFac()+"\n";
    }
}
