package ai.robe;

public class Magazzino {
    Casetto matite;
    Casetto quaderni;

    public Magazzino() {
        matite = new Casetto(1000, "matite");
        quaderni = new Casetto(1000, "quaderni");
    }

    public int getQuaderni() {
        return quaderni.getType(10);
    }

    public int getMatite() {
        return matite.getType(10);
    }
}
