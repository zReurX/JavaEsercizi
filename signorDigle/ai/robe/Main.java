package ai.robe;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Biglittaio> biglittaios = new ArrayList<>();
        Cinema cinema = new Cinema();

        for (int i = 0; i < 10; i++) {
            biglittaios.add(new Biglittaio(cinema));
        }

        for (Biglittaio biglittaio : biglittaios) {
            biglittaio.start();
        }
        for (Biglittaio biglittaio : biglittaios) {
            biglittaio.join();
        }
    }
}