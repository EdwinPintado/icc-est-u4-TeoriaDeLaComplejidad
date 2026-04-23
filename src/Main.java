import complejidades.ComplejidadConstante;
import complejidades.ComplejidadLineal;
import complejidades.ComplejidadCuadratica;
import complejidades.ComplejidadLogaritmica;
import complejidades.ComplejidadNLogN;

public class Main {
    public static void main(String[] args) {

        System.out.println("Demostración de diferentes complejidades algorítmicas\n");

        System.out.println("COMPLEJIDAD O(1) (CONSTANTE) ");
        new ComplejidadConstante().ejemplo();

        System.out.println("\nCOMPLEJIDAD O(n) (LINEAL)");
        new ComplejidadLineal().ejemplo();

        System.out.println("\nCOMPLEJIDAD O(n^2) (CUADRÁTICA)");
        new ComplejidadCuadratica().ejemplo();

        System.out.println("\nCOMPLEJIDAD O(log n) (LOGARÍTMICA)");
        new ComplejidadLogaritmica().ejemplo();

        System.out.println("\nCOMPLEJIDAD O(n log n)");
        new ComplejidadNLogN().ejemplo();
    }
}