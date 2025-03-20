package ejerciciosarreglosunidimensionales;

import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class ejercicio9 {
    public static void main(String[] args) {
        // a) Adicionar 6 datos y imprimirlos en la lista.
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);
        a.add(60);
        System.out.println("Lista a: " + a);

        // b) Adicione 2 valores: en la posicion 1 e imprima de nuevo.
        a.add(1, 1000);
        a.add(3, 2000);
        System.out.println("Lista a despues de adicionar 1000 y 2000: " + a);

        // c) Reemplace 2 valores usando set en la posicion 0 (5000) y en la posicion 2 (10000) e imprima.
        a.set(0, 5000);
        a.set(2, 10000);
        System.out.println("Lista a despues de reemplazar valores: " + a);

        // d) Imprima la posicion (índice) de la primera ocurrencia del valor 2000.
        System.out.println("Primera ocurrencia de 2000: " + a.indexOf(2000));

        // e) Imprima la posicion (índice) de la ultima ocurrencia del valor 2000.
        System.out.println("Ultima ocurrencia de 2000: " + a.lastIndexOf(2000));

        // f) Adicione 2000 en la última posicion.
        a.add(2000);
        System.out.println("Lista a despues de adicionar 2000 al final: " + a);

        // g) Repita las impresiones de los puntos d) y e) y observe que posiciones(índices) muestra ahora.
        System.out.println("Primera ocurrencia de 2000: " + a.indexOf(2000));
        System.out.println("Ultima ocurrencia de 2000: " + a.lastIndexOf(2000));

        // h) Averiguar si el valor (Objeto) 40 esta en el ArrayList y en qué posicion (si esta).
        if (a.contains(40)) {
            System.out.println("El valor 40 esta en la lista en la posicion: " + a.indexOf(40));
        } else {
            System.out.println("El valor 40 no esta en la lista.");
        }

        // i) Elimine el valor que se encuentre en la posicion 5 del ArrayList e imprima para verificar que se eliminó.
        a.remove(5);
        System.out.println("Lista a despues de eliminar el valor en la posicion 5: " + a);

        // j) Averiguar si la lista esta vacía y si no, cuantos elementos tiene.
        if (a.isEmpty()) {
            System.out.println("La lista a esta vacía.");
        } else {
            System.out.println("La lista a no esta vacia y tiene " + a.size() + " elementos.");
        }

        // k) Crear un segundo ArrayList (nómbrelo =>(b)) con 3 objetos enteros 111, 222 y 333 e imprímalo.
        ArrayList<Integer> b = new ArrayList<>();
        b.add(111);
        b.add(222);
        b.add(333);
        System.out.println("Lista b: " + b);

        // l) Crear un tercer ArrayList (nómbrelo =>(c)) con 2 objetos enteros 77777 y 88888 e imprímalo.
        ArrayList<Integer> c = new ArrayList<>();
        c.add(77777);
        c.add(88888);
        System.out.println("Lista c: " + c);

        // m) Agregar a la lista llamada (b) los elementos de las listas (a) y (c) e imprima la lista (b).
        b.addAll(a);
        b.addAll(c);
        System.out.println("Lista b despues de agregar elementos de a y c: " + b);

        // n) Adicionar un nuevo valor (99999) a la lista (a) e imprímala.
        a.add(99999);
        System.out.println("Lista a despues de adicionar 99999: " + a);

        // o) Borre de la lista (b) UNICAMENTE los elementos de la lista (a) e imprima la lista (b). Se puede hacer? Revise como quedo la lista (a).
        b.removeAll(a);
        System.out.println("Lista b despues de borrar elementos de a: " + b);
        System.out.println("Lista a: " + a);

        // p) Borre TODOS los elementos de la lista (a) y verifique que quedo vacía.
        a.clear();
        System.out.println("Lista a despues de borrar todos los elementos: " + a);
    }
}