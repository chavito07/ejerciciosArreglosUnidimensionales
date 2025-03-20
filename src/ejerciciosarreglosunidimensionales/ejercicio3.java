package ejerciciosarreglosunidimensionales;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class ejercicio3 {

    // Boi a hacer un metodo para calcular el factorial de un numero
    public static long calcularFactorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        }
        long factorial = 1;
        for (int i = 2; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la cantidad de numeros
        System.out.print("Ingrese la cantidad de numeros: ");
        int n = scanner.nextInt();

        // Crear arreglos para almacenar los números y sus factoriales
        int[] numeros = new int[n];
        long[] factoriales = new long[n];

        // Leer los numeros y calcular sus factoriales
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            factoriales[i] = calcularFactorial(numeros[i]);
        }

        // Imprimir los numeros iniciales
        System.out.println("numeros iniciales:");
        for (int i = 0; i < n; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        // Imprimir los factoriales
        System.out.println("Factoriales:");
        for (int i = 0; i < n; i++) {
            System.out.print(factoriales[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
