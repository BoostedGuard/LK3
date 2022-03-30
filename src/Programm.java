import java.util.ArrayList;

public class Programm{
    public static void main(String[] args) {
        ArrayList<MoebelStueck> moebelListe = new ArrayList<>();

        Kontakt kontakt = new Kontakt("Lucas@","984651","6519865");
        Techniker techniker = new Techniker("Lucas ", "Buldmann", kontakt);

        Stuhl stuhl1 = new Stuhl("123456","HolzStuhl",80);
        Stuhl stuhl2 = new Stuhl("654321", "Metalstuhl",70);
        moebelListe.add(stuhl1);
        moebelListe.add(stuhl2);

        Tisch tisch1 = new Tisch("456789", "Holztisch",100,80,80);
        Tisch tisch2 = new Tisch("987654", "Metaltisch", 90 , 70 , 70);
        moebelListe.add(tisch1);
        moebelListe.add(tisch2);

        for ( int i = 0; moebelListe ; i++){
            
        }


        for (MoebelStueck m:moebelListe) {
            System.out.println(moebelListe);
        }
    }
}
