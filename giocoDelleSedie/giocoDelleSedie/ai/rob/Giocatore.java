package ai.rob;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Giocatore extends Thread {
    private static int identificativo = 1;
    private int id;
    private List<Sedia> chairs = new ArrayList<>();
    
    public Giocatore(List<Sedia> chairs) {
        id = identificativo++;
        this.chairs = chairs;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        int random_chair = ThreadLocalRandom.current().nextInt(chairs.size());
        int count = 0;
        while (Boolean.FALSE.equals(chairs.get(random_chair).setIsOccupied()) && count < chairs.size()) {
            random_chair = (random_chair + 1) % chairs.size();
            count++;
        }
        if (count < chairs.size()) {
            chairs.get(random_chair);
            System.out.println("Il giocatore " + id + " ha occupato la sedia: " + chairs.get(random_chair).getIdentificativo());
        } else {
            System.out.println("Il giocatore " + id + " ha perso");
        }

    }

    public long getIdentificativo() {
        return id;
    }
}
