
public class SortSoin extends Sort {

    public static final String TYPE = "SortSoin";

    public static String categorie = "Soin";

    public SortSoin(String s, int pui, int fac) {
        super(s,pui,fac);
    }
    
    public SortSoin(Capacite cap) {
        super(cap);
    }
    
    public String getType(){
    	return super.getType()+SortSoin.TYPE;
    }

    public String toString(){
    	return super.toString()+SortSoin.TYPE+"\nPuissance = "+this.getPui()+"\nFaculte = "+
    			this.getFac()+"\n";
    }
}
