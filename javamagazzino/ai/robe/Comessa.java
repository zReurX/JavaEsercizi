package ai.robe;

import java.util.Random;

public class Comessa extends Thread {
    Magazzino mag;
    Cartoleria cart;

    public Comessa(Magazzino mag, Cartoleria cart) {
        this.mag = mag;
        this.cart = cart;
    }

    @Override
    public void run() {
        Random rnd = new Random();
        int nQuad = rnd.nextInt(9) + 1;
        int nMatite = rnd.nextInt(9) + 1;
        System.out.println(Thread.currentThread().getId() +" Comessa ti sta servendo");
        System.out.println(Thread.currentThread().getId() +" matite: " + nMatite);
        System.out.println(Thread.currentThread().getId() +" Quaderni: " + nQuad);
        int totQuad = cart.getQuaderni(nQuad);
        if (totQuad == -1) {
            totQuad = mag.getQuaderni();
            cart.setQuaderni(totQuad - nQuad);
            totQuad -= nQuad;
        }
        int totMatite = cart.getMatite(nMatite);
        if (totMatite == -1) {
            totMatite = mag.getMatite();
            cart.setMatite(totMatite - nMatite);
            totMatite -= nMatite;
        }
        System.out.println("Comessa ha finito di servirti");
    }
}
