package complejidades;

public class ComplejidadLogaritmica {

    /**
     * Complejidad: O(log n)
     * En cada iteración el problema se reduce a la mitad
     */
    public void ejemplo() {
        System.out.println("Ejemplo O(log n):");

        int n = 16;

        while (n > 1) {
            System.out.println("Valor actual: " + n);
            n = n / 2;
        }
    }
}