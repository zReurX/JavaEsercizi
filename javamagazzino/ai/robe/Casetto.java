package ai.robe;

public class Casetto {
    private String type = "undefined";
    private int qt = 10;

    public Casetto(int qt, String type) {
        this.qt = qt;
        this.type = type;
    }

    public synchronized int getType(int n) {
        int tot = -1;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if (n < qt) {
            qt -= n;
            tot = n;
        }
        return tot;
    }
    public synchronized void setType(int n) {
        if (n > 0 && n + qt <= 10) {
            qt += n;
        } 
    }

    public int getQt() {
        return qt;
    }

    public String getName() {
        return type;
    }
}
