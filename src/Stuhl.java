public class Stuhl extends MoebelStueck{
    private double hoeheSitz;

    public Stuhl(String inventarNr, String bezeichnung, double hoeheSitz){
        super(inventarNr,bezeichnung);
        this.hoeheSitz = hoeheSitz;
    }

    public double getHoeheSitz() {
        return hoeheSitz;
    }

    public void setHoeheSitz(double hoeheSitz) {
        this.hoeheSitz = hoeheSitz;
    }

    @Override
    public String toString() {
        return "Stuhl{" +
                "hoeheSitz=" + hoeheSitz +
                '}';
    }
}
