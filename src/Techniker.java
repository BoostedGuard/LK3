public class Techniker {
    private String vorname;
    private String nachname;
    private Kontakt kontakt;

    public Techniker(String vorname, String nachname, Kontakt kontakt){
        this.kontakt=kontakt;
        this.nachname=nachname;
        this.vorname=vorname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getNachname() {
        return nachname;
    }

    public Kontakt getKontakt() {
        return kontakt;
    }

    public void setKontakt(Kontakt kontakt) {
        this.kontakt = kontakt;
    }

    @Override
    public String toString() {
        return "Techniker{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", kontakt=" + kontakt +
                '}';
    }
}
