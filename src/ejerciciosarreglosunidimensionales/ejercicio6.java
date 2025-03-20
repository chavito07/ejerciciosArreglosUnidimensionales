package ejerciciosarreglosunidimensionales;

import java.util.ArrayList;

public class ejercicio6 {
    public static void main(String[] args) {
        // Creación del ArrayList con 5 nombres
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Cristian");
        nombres.add("Andres");
        nombres.add("Chestos");
        nombres.add("Ana");
        nombres.add("Luis");

        // a) Imprimir el ArrayList
        System.out.println("ArrayList inicial: " + nombres);

        // b) Adicionar en la posicion 1 un nuevo nombre
        nombres.add(1, "El Loro");
        System.out.println("Despues de adicionar en la posicion 1: " + nombres);

        // c) Remover de la posicion 0 el nombre correspondiente
        nombres.remove(0);
        System.out.println("Despues de remover de la posicion 0: " + nombres);

        // d) Adicionar en la posicion 0 un nuevo nombre
        nombres.add(0, "Natalia");
        System.out.println("Despues de adicionar en la posicion 0: " + nombres);

        // e) Imprimir el ArrayList
        System.out.println("ArrayList final: " + nombres);

        // f) Obtener el nombre de la posicion 1 como String
        String nombrePos1 = nombres.get(1);
        System.out.println("Nombre en la posicion 1: " + nombrePos1);

        // g) Obtener el último nombre de la posicion e imprimirlo
        String ultimoNombre = nombres.get(nombres.size() - 1);
        System.out.println("ultimo nombre en la lista: " + ultimoNombre);
    }
}