package complejidades;

public class ComplejidadCuadratica {

    /**
     * Complejidad O(n²)
     * Dos bucles anidados.
     */
    public void ejemplo() {
        System.out.println("Ejemplo O(n²)");

        int n = 3;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + "," + j);
            }
        }
    }
}
