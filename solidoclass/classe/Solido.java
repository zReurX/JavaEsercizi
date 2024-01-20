package solidoclass.classe;

public abstract class Solido {
    private double pesoSpecifico;

    protected Solido() {
        pesoSpecifico = 0;
    }

    protected Solido(double pesoSpecifico) {
        this.pesoSpecifico = pesoSpecifico;
    }

    public double getPesoSpecifico() {
        return pesoSpecifico;
    }

    public abstract double superficie();
    public abstract double volume();

    public double peso() {
        return pesoSpecifico;
    }
}
