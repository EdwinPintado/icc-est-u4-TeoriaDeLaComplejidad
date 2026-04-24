package complejidades;

public class ComplejidadConstante {

    /**
     * Complejidad O(1)
     * El número de operaciones no depende de n.
     */
    public void ejemplo() {
        System.out.println("Ejemplo O(1)");

        int x = 10;
        int y = 20;
        int suma = x + y;

        System.out.println("Resultado: " + suma);
    }
}