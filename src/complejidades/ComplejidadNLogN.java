package complejidades;

public class ComplejidadNLogN {

    /**
     * Complejidad: O(n log n)
     * Combina un ciclo lineal con uno logarítmico
     */
    public void ejemplo() {
        System.out.println("Ejemplo O(n log n):");

        int n = 4;

        for (int i = 0; i < n; i++) {
            int j = n;

            while (j > 1) {
                System.out.println("i: " + i + ", j: " + j);
                j = j / 2;
            }
        }
    }
}