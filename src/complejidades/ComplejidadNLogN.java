package complejidades;

public class ComplejidadNLogN {

    /**
     * O(n log n)
     * Ejemplo similar a algoritmos de ordenamiento como Merge Sort
     * Se combina recorrido lineal con reducción logarítmica
     */
    public void ejemplo() {
        System.out.println("Ejemplo O(n log n)");

        int n = 4;
        int[] datos = {4, 2, 3, 1};

        for (int i = 0; i < n; i++) {

            int temp = n;

            // simulación de división del problema (log n)
            while (temp > 1) {
                System.out.println("i: " + i + " | paso log: " + temp);
                temp = temp / 2;
            }
        }
    }
}