import complejidades.ComplejidadConstante;
import complejidades.ComplejidadLineal;
import complejidades.ComplejidadCuadratica;
import complejidades.ComplejidadLogaritmica;
import complejidades.ComplejidadNLogN;

public class Main {
    public static void main(String[] args) {

        System.out.println("----- COMPLEJIDAD O(1) -----");
        new ComplejidadConstante().ejemplo();

        System.out.println("\n----- COMPLEJIDAD O(n) -----");
        new ComplejidadLineal().ejemplo();

        System.out.println("\n----- COMPLEJIDAD O(n^2) -----");
        new ComplejidadCuadratica().ejemplo();

        System.out.println("\n----- COMPLEJIDAD O(log n) -----");
        new ComplejidadLogaritmica().ejemplo();

        System.out.println("\n----- COMPLEJIDAD O(n log n) -----");
        new ComplejidadNLogN().ejemplo();
    }
}