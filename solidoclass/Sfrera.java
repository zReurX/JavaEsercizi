package solidoclass;

public class Sfrera extends Solido {
    private double raggio;

    public Sfrera() {
        super();
        raggio = 0;
    }

    public Sfrera(double pesoSpecifico, double raggio) {
        super(pesoSpecifico);
        this.raggio = raggio;
    }

    public double superficie() {
        return 4 * Math.PI * Math.pow(raggio, 2);
    }
    public double volume() {
        return (4 * Math.PI * Math.pow(raggio, 3)) / 3;
    }
}
