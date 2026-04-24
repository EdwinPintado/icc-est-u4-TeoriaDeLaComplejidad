import complejidades.ComplejidadConstante;
import complejidades.ComplejidadLineal;
import complejidades.ComplejidadCuadratica;
import complejidades.ComplejidadLogaritmica;
import complejidades.ComplejidadNLogN;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion = -1;

        while (opcion != 0) {

            System.out.println("\nCOMPLEJIDADES COMPUTACIONALES");
            System.out.println("1. O(1) - Constante");
            System.out.println("2. O(n) - Lineal");
            System.out.println("3. O(n^2) - Cuadrática");
            System.out.println("4. O(log n) - Logarítmica");
            System.out.println("5. O(n log n)");
            System.out.println("0. Salir");

            System.out.print("Elige una opción: ");

            // validación básica para evitar errores si meten letras
            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
            } else {
                System.out.println("Entrada inválida. Debes ingresar un número.");
                sc.next(); // limpia entrada incorrecta
                continue;
            }

            if (opcion == 1) {
                System.out.println("\n O(1) - COMPLEJIDAD CONSTANTE ");
                new ComplejidadConstante().ejemplo();
            }

            else if (opcion == 2) {
                System.out.println("\n O(n) - COMPLEJIDAD LINEAL ");
                new ComplejidadLineal().ejemplo();
            }

            else if (opcion == 3) {
                System.out.println("\n O(n^2) - COMPLEJIDAD CUADRÁTICA ");
                new ComplejidadCuadratica().ejemplo();
            }

            else if (opcion == 4) {
                System.out.println("\n O(log n) - COMPLEJIDAD LOGARÍTMICA ");
                new ComplejidadLogaritmica().ejemplo();
            }

            else if (opcion == 5) {
                System.out.println("\n O(n log n) - COMPLEJIDAD N LOG N ");
                new ComplejidadNLogN().ejemplo();
            }

            else if (opcion == 0) {
                System.out.println("Has salido del programa.");
            }

            else {
                System.out.println("Opción inválida.");
            }
        }

        sc.close();
    }
}