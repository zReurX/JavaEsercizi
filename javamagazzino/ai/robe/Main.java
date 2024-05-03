package ai.robe;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Comessa> comesse = new ArrayList<>();
        Magazzino magazzino = new Magazzino();
        Cartoleria cartoleria = new Cartoleria();

        for (int i = 0; i < 2; i++) {
            comesse.add(new Comessa(magazzino, cartoleria));
        }

        for (Comessa comessa : comesse) {
            comessa.start();
        }
        for (Comessa comessa : comesse) {
            comessa.join();
        }

        cartoleria.getInfo();
    }

}