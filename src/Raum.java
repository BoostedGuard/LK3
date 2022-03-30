import java.util.ArrayList;

public class Raum extends MoebelStueck{
    private String raumNr;
    private Techniker techniker;
    private ArrayList<MoebelStueck>moebelListe = new ArrayList<>();

    public Raum(String raumNr, String bezeichnung){
        super(bezeichnung);
        this.raumNr = raumNr;
    }

    public String getRaumNr() {
        return raumNr;
    }

    public Techniker getTechniker() {
        return techniker;
    }

    public void setTechniker(Techniker techniker) {
        this.techniker = techniker;
    }
    public void addMoebel(MoebelStueck moebelStueck){
        moebelListe.add(moebelStueck);
    }
    public void removeMoebel ( MoebelStueck moebelStueck){
        moebelListe.remove(moebelStueck);
    }

    public int getAnzahlMoeble(){
        int anzahlMoeble = 0;
        for(MoebelStueck m:moebelListe){
            anzahlMoeble++;
        }
        return anzahlMoeble;
    }
    public double getGewichtGesamt(){
        int gesamtGewicht = 0;
        for (MoebelStueck m: moebelListe) {
            gesamtGewicht+=getGewicht();
        }
        return gesamtGewicht;
    }
    public MoebelStueck getMoeble(String inventarNr){
        return getMoeble(inventarNr);
    }

}
