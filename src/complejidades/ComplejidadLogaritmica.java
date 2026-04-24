package complejidades;

public class ComplejidadLogaritmica {

    /**
     * Complejidad O(log n)
     * El problema se reduce a la mitad en cada paso.
     * Ejemplo similar a búsqueda binaria.
     */
    public void ejemplo() {
        System.out.println("Ejemplo O(log n)");

        int n = 16;

        while (n > 1) {
            System.out.println(n);
            n = n / 2;
        }
    }
}