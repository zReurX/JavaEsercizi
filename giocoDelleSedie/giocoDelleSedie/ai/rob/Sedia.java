package ai.rob;

import javax.swing.text.StyledEditorKit.BoldAction;

public class Sedia {
    private static int identificativo = 1;
    public int id;
    private Boolean isOccupied;

    public Sedia() {
        isOccupied = false;
        id = identificativo++;
    }

    public int getIdentificativo() {
        return id;
    }

    public void setIdentificativo(int id) {
        this.id = id;
    }

    public synchronized Boolean setIsOccupied() {
        Boolean temp = isOccupied;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if (Boolean.FALSE.equals(temp)) {
            isOccupied = !temp;
            return true;
        }
        return false;
    }

    public Boolean getIsOccupied() {
        return isOccupied;
    }
}
