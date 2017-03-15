

public class Remede extends Capacite {

    private int pui;

    private int fac;

    public static final String TYPE = "Remede";
    public static final String CATEGORIE = "Soin";

    public Remede(String s, int pui, int fac) {
        super(s);
        this.setPui( pui);
        this.setFac(fac);
    }
    

    public Remede(Capacite cap) {
        super(cap.getNom());
        this.setPui(cap.getPui());
        this.setFac(cap.getFac());
    }


    public String getCategorie() {
        return Remede.CATEGORIE;
    }


    public int getPui() {
        return this.pui;
    }

    public void setPui(int pui) {
        this.pui = pui;
    }


    public int getFac() {
        return this.fac;
    }


    public void setFac(int fac) {
        this.fac = fac;
    }


    public float getPba(Combattant combattant) {
        return (combattant.getDex()*getFac())/10000;
    }


    public float getEff(Combattant combattant) {
        return (combattant.getFor()*this.getPui()/100);

    }

    public String getType(){
    	return Remede.TYPE;
    }
    public String toString(){
    	return super.toString()+Remede.TYPE+"\nPuissance = "+this.getPui()+"\nFaculte = "+
    			this.getFac()+"\n";
    }
}
