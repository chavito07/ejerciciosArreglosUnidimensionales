package ejerciciosarreglosunidimensionales;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int numero;
        
        // Leer numeros enteros hasta que se lea un 0
        System.out.println("Introduce numeros enteros (0 para terminar):");
        while ((numero = scanner.nextInt()) != 0) {
            numeros.add(numero);
        }
        
        // Mostrar los numeros leídos
        System.out.println("Numeros leidos: " + numeros);
        
        // Calcular la suma de los numeros
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        System.out.println("Suma de los numeros: " + suma);
        
        // Calcular la media de los numeros
        double media = numeros.isEmpty() ? 0 : (double) suma / numeros.size();
        System.out.println("Media de los numeros: " + media);

        scanner.close();
    }
    
}
