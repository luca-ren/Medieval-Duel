
public class Sort extends Capacite {
    private int pui;
    private int fac;
    
    public Sort(String s, int pui, int fac) {
        super(s);
        this.setPui( pui);
        this.setFac(fac);
    }
    
    public Sort(Capacite cap) {
        super(cap.getNom());
        this.setPui(cap.getPui());
        this.setFac(cap.getFac());
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
        return (combattant.getIntel()*this.getFac())/10000;
    }


    public float getEff(Combattant combattant) {
        return (combattant.getCon()*getPui()/100);

    }
    
    public String getType(){
    	return super.getType();
    }
    public String toString(){
    	return super.toString();
    }

}
