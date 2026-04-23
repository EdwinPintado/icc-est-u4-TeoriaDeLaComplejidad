package complejidades;

public class ComplejidadLineal {

    /**
     * Complejidad: O(n)
     * El número de operaciones depende directamente de n
     */
    public void ejemplo() {
        System.out.println("Ejemplo O(n):");

        int n = 5;

        for (int i = 0; i < n; i++) {
            System.out.println("Iteración: " + i);
        }
    }
}