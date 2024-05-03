package ai.robe;

import java.util.ArrayList;
import java.util.List;


public class Cinema {
    private List<Posto> postiList;
    private static int maxPosti = 20;

    public Cinema() {
        postiList = new ArrayList<>();
        for (int i = 0; i < maxPosti; i++) {
            postiList.add(new Posto(i, false));
        }
    }

    public Boolean bookPlace(int indice) {
        return postiList.get(indice).setOcupied();
    }

}
