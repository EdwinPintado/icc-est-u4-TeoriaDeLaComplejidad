package complejidades;

public class ComplejidadNLogN {

    /**
     * Complejidad O(n log n)
     * Se combina un ciclo lineal con uno logarítmico.
     * Ejemplo educativo simple.
     */
    public void ejemplo() {

        System.out.println("Ejemplo O(n log n)");

        int n = 5;

        // Parte O(n)
        for (int i = 0; i < n; i++) {

            System.out.println("Elemento " + i);

            // Parte O(log n)
            int temp = n;

            while (temp > 1) {
                System.out.println("   Reducción: " + temp);
                temp = temp / 2;
            }
        }
    }
}