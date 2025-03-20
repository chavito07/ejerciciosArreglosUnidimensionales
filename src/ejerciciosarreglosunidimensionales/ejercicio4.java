package ejerciciosarreglosunidimensionales;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */

public class ejercicio4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] numeros = new int[10];

            // Leer los 10 numeros enteros
            System.out.println("Ingrese 10 numeros enteros:");
            for (int i = 0; i < 10; i++) {
                numeros[i] = scanner.nextInt();
            }

            // Encontrar el numero menor y el numeros mayor
            int menor = numeros[0];
            int mayor = numeros[0];
            for (int i = 1; i < 10; i++) {
                if (numeros[i] < menor) {
                    menor = numeros[i];
                }
                if (numeros[i] > mayor) {
                    mayor = numeros[i];
                }
            }

            // Imprimir el numero menor y el numeros mayor
            System.out.println("El numeros menor del arreglo es: " + menor);
            System.out.println("El numeros mayor del arreglo es: " + mayor);
        }
    }
}
