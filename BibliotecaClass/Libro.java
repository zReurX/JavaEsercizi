import java.util.Scanner;

public class Libro {
    private int codice;
    private String titolo;
    private String date;
    private String editore;

    public Libro() {
        codice = 0;
        titolo = "";
        date = "";
        editore = "";
    }

    public Libro(int c, String t, String d, String e) {
        codice = c;
        titolo = t;
        date = d;
        editore = e;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getDate() {
        return date;
    }
    public String getEditore() {
        return editore;
    }

    public void read() {
        Scanner scanner  =new Scanner(System.in);
        System.out.println("Inserisci il codice: ");
        codice = scanner.nextInt();
        System.out.println("Inserisci il titolo: ");
        titolo = scanner.next();
        System.out.println("Inserisci la data: ");
        date = scanner.next();
        System.out.println("Inserisci l'editore: ");
        editore = scanner.next();
        scanner.close();
    }

    public void stampa() {
        System.out.println("Codice: " + codice);
        System.out.println("Titolo: " + titolo);
        System.out.println("Data: " + date);
        System.out.println("Editore: " + editore);
    }
}
