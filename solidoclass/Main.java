package solidoclass;
import solidoclass.classe.Sfrera;
import solidoclass.classe.Cubo;

public class Main {
    public static void main(String[] args) {
        Sfrera s1 = new Sfrera(3, 4);
        double n = s1.volume();
        System.out.println("Volume: " + n + "\nSuperficie: " + s1.superficie());
        
        Cubo c1 = new Cubo(3, 3);
        System.out.println("Volume: " + c1.volume() + "\nSuperficie: " + c1.superficie());
    }
}
