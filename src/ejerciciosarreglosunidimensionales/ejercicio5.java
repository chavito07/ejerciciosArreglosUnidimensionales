package ejerciciosarreglosunidimensionales;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de numeros: ");
        
        int cantidad = scanner.nextInt();
        int[] numeros = new int[cantidad];
        int[] invertidos = new int[cantidad];

        System.out.println("Ingrese los numeros:");
        for (int i = 0; i < cantidad; i++) {
            numeros[i] = scanner.nextInt();
            String invertidoStr = new StringBuilder(String.valueOf(numeros[i])).reverse().toString();
            invertidos[i] = invertidoStr.equals("-") ? 0 : Integer.parseInt(invertidoStr.replace("-", ""));
        }

        System.out.println("\nNumeros iniciales:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        
        System.out.println("\nNumeros invertidos:");
        for (int num : invertidos) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }
}