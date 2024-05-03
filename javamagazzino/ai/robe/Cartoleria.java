package ai.robe;

public class Cartoleria {
    Casetto matite;
    Casetto quaderni;

    public Cartoleria() {
        matite = new Casetto(10, "matite");
        quaderni = new Casetto(10, "quaderni");
    }

    public int getQuaderni(int n) {
        return quaderni.getType(n);
    }

    public void setQuaderni(int n) {
        quaderni.setType(n);
    }

    public int getMatite(int n) {
        return matite.getType(n);
    }
    public void setMatite(int n) {
        matite.setType(n);
    }

    public void getInfo() {
        System.out.println("Matite: " + matite.getQt());
        System.out.println("Quaderni: " + quaderni.getQt());
    }
}
