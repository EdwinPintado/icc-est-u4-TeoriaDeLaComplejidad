package complejidades;

public class ComplejidadCuadratica {

    /**
     * Complejidad: O(n^2)
     * Se deben a ciclos anidados
     */
    public void ejemplo() {
        System.out.println("Ejemplo O(n^2):");

        int n = 3;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }
}
