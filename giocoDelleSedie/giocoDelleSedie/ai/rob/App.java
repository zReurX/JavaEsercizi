/*Ci sono 19 sedie e 20 giocatori (thread). Tutte le sedie e i giocatori hanno un identificativo numerico progressivo (la prima sedia ha identificativo 1, la seconda 2, ecc.; il primo giocatore ha identificativo 1, il secondo 2, ecc.). Si gioca un solo turno per determinare uno ed un solo giocatore che ha perso. Una volta inizializzati tutti i giocatori, il gioco parte. Dopo essere partiti, ogni giocatore aspetta esattamente 1 secondo e poi inizia a cercare una sedia. La ricerca della sedia avviene in modo casuale solamente al primo tentativo. Se il giocatore trova una sedia occupata, procede la ricerca da lì in avanti sequenzialmente in ordine progressivo finché non ne trova una libera (dovrà eventualmente rifare un giro parziale a partire dall’inizio fino a tornare alla sedia da cui ha iniziato a cercare). Se non ci sono più sedie libere, il giocatore semplicemente termina la sua esecuzione. Se il giocatore trova una sedia libera, ci si siede (imposta il campo gioc */

package ai.rob;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws InterruptedException {
        List<Giocatore> players = new ArrayList<>();
        List<Sedia> chairs = new ArrayList<>();

        for (int i = 0; i < 19; i++) {
            chairs.add(new Sedia());
        }

        for (int i = 0; i < 20; i++) {
            players.add(new Giocatore(chairs));
        }

        for (Giocatore player : players) {
            player.start();
        }
        for (Giocatore player : players) {
            player.join();
        }
    }
}
