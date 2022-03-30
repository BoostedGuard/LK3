public class MoebellNichtGefundenException {
    private String inventarNr;

    public String getInventarNr() {
        return inventarNr;
    }
    public String getMessage(){
        String text = "Das Möbelstück wurde nicht gefunden";
        return text;
    }
}
