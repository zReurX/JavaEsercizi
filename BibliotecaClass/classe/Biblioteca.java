package classe;
import java.util.Scanner;

public class Biblioteca {
    private Libro[] libri;
    private int dim;

    public Biblioteca() {
        dim = 0;
        libri = null;
    }

    
    public Biblioteca(int d) {
        if (dim < 0) {
            dim = 0;
            libri = null;
        }
        dim = d;
        libri = new Libro[dim];
        for (int i = 0; i < dim; i++) {
            libri[i] = new Libro();
        }
    }
    
    public void stampaBiblioteca() {
        for (int i = 0; i < dim; i++) {
            libri[i].stampa();
        }
    }

    public void leggiBiblioteca() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insersci il numero di libri: ");
        dim = scanner.nextInt();
        libri = new Libro[dim];
        for (int i = 0; i < dim; i++) {
            libri[i] = new Libro();
        }
        for (int i = 0; i < dim; i++) {
            libri[i].read();
        }
        scanner.close();
    }

    public void addLibro() {
        Libro[] temp = new Libro[dim];
        for (int i = 0; i < dim; i++) {
            temp[i] = libri[i];
        }
        libri = new Libro[dim + 1];
        for (int i = 0; i < dim - 1; i++) {
            libri[i] = temp[i];
        }
        libri[dim - 1].read();
    }
    
    public int cerca(String daTrovare) {
        int i = 0;
        while (i < dim && !(libri[i].getTitolo().equals(daTrovare))) {
            i++;
        }
        if (i < dim) {
            return i;
        }
        return -1;
    }

    public void cercaLibro() {
        // dafare
    }

    public void cercaLibroAutore() {
        // dafare
    }


}
