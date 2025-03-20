package ejerciciosarreglosunidimensionales;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
// Clase principal
public class ejercicio8 {
    private final ArrayList<Integer> listaPares = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);
    
    // Constructor para inicializar el Arraylist con los primeros numeros pares 
    public ejercicio8() {
        for (int i = 0; i < 20; i++) listaPares.add(i * 2);
    }
    
    //Metodo para insertar un numero 
    public void insertarNumero() {
        System.out.print("Ingrese un numero: ");
        listaPares.add(scanner.nextInt());
        Collections.sort(listaPares);
    }
    
    //Metodo para eliminar un numero
    public void eliminarNumero() {
        System.out.print("Ingrese un numero a eliminar: ");
        listaPares.remove(Integer.valueOf(scanner.nextInt()));
    }

    //Metodo para mostrar la lista 
    public void mostrarLista() {
        System.out.println(listaPares);
    }
    
    //Metodo para cerrar el scanner
    public void cerrarScanner() {
        scanner.close();
    }

    //Metodo main principal que ejecuta las operaciones 
    public static void main(String[] args) {
        ejercicio8 ejercicio = new ejercicio8();
        ejercicio.mostrarLista();
        ejercicio.insertarNumero();
        ejercicio.mostrarLista();
        ejercicio.eliminarNumero();
        ejercicio.mostrarLista();
        ejercicio.cerrarScanner();
    }
}