package ejerciciosarreglosunidimensionales;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Daniel
 */
public class EjerciciosArreglosUnidimensionales {
    public static void main(String[] args) {
        // 1. Usando un arreglo unidimensional
        int[] numerosPrimos = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};

        // Imprimir el arreglo
        System.out.println("Arreglo unidimensional:");
        for (int numero : numerosPrimos) {
            System.out.print(numero + " ");
        }
        System.out.println(); // Salto de línea

        // 2. Convertir el arreglo a un ArrayList
        List<Integer> listaPrimos = new ArrayList<>();
        for (int primo : numerosPrimos) {
            listaPrimos.add(primo);
        }

        // Imprimir el ArrayList
        System.out.println("\nArrayList:");
        for (int primo : listaPrimos) {
            System.out.print(primo + " ");
        }

        // Ejercicio #2 Inicializar un arreglo con los primeros 100 números pares
        int[] numerosPares = new int[100];
        for (int i = 0; i < 100; i++) {
            numerosPares[i] = i * 2;
        }       

        // Imprimir el arreglo
        System.out.println("\n\nArreglo con los primeros 100 numeros pares:");
        for (int numero : numerosPares) {
            System.out.print(numero + " ");
        }

        // b) Imprimir en 10 líneas, indicando el nnmero de línea
        System.out.println("\n\nNumeros pares en 10 lineas:");
        for (int i = 0; i < 100; i++) {
            if (i % 10 == 0) {
                System.out.print("\nLinea " + (i / 10 + 1) + ": ");
            }
            System.out.print(numerosPares[i] + " ");
        }       
        

    }
}
