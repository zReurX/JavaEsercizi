package ai.robe;

import java.util.concurrent.ThreadLocalRandom;

public class Biglittaio extends Thread {
    private Cinema cinema;

    public Biglittaio(Cinema  cinema) {
        this.cinema = cinema;
    }

    @Override
    public void run() {
        int numP1 = ThreadLocalRandom.current().nextInt(20);
        int numP2 = (numP1 + 1) % 20;

        
        while (Boolean.FALSE.equals(cinema.bookPlace(numP1))){
            numP1 = (numP1 + 1) % 20;
        }
        while (Boolean.FALSE.equals(cinema.bookPlace(numP2))) {
            numP2 = (numP2 + 1) % 20;
        }
        
        System.out.println("Bigliettaio N. " + Thread.currentThread().getId() + " Prenotati posti N: " + numP1 + ", " + numP2);
    }
}
