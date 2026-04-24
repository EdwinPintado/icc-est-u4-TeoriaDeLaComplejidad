package complejidades;

public class ComplejidadLineal {

    /**
     * Complejidad O(n)
     * Recorre todos los elementos una sola vez.
     */
    public void ejemplo() {
        System.out.println("Ejemplo O(n)");

        int n = 5;

        for (int i = 0; i < n; i++) {
            System.out.println("Iteración: " + i);
        }
    }
}