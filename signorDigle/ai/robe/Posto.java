package ai.robe;

public class Posto {
    private int indice = -1;
    private Boolean isOccupied = false;

    public Posto(int indice, Boolean isOccupied) {
        this.indice = indice;
        this.isOccupied = isOccupied;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public int getIndice() {
        return indice;
    }

    public synchronized void setDisOccupied() {
        Boolean temp = isOccupied;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if (Boolean.TRUE.equals(temp)) {
            isOccupied = !temp;
        }
    }

    public synchronized Boolean getIsOccupied() {
        return isOccupied;
    }

    public synchronized Boolean setOcupied() {
        /*Flag che indica se è stato prenotato */
        Boolean flag = false;
        Boolean temp = isOccupied;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if (Boolean.FALSE.equals(isOccupied)) {
            isOccupied = !temp;
            flag = true;
        }
        return flag;
    }
}
