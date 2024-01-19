package solidoclass;

public class Cubo extends Solido {
    private double lato;

    public Cubo() {
        super();
        lato = 0;
    }

    public Cubo(double pesoSpecifico, double lato) {
        super(pesoSpecifico);
        this.lato = lato;
    }

    public double getLato() {
        return lato;
    }

    public double superficie() {
        return 6 * Math.pow(lato, 2);
    }

    public double volume() {
        return Math.pow(lato, 3);
    }
}
