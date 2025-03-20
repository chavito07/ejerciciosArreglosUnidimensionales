package ejerciciosarreglosunidimensionales;

import java.util.ArrayList;


/**
 *
 * @author PERSONAL
 */
public class ejercicio10partidos {
    public static void main(String[] args) {
        ArrayList<PartidoFutbol> partidos = new ArrayList<>();
        partidos.add(new PartidoFutbol("Sevilla", "Barcelona", 2, 1));
        partidos.add(new PartidoFutbol("Real Madrid", "Sevilla", 0, 3));
        partidos.add(new PartidoFutbol("Atletico", "Sevilla", 1, 1));

        // a) Mostrar partidos donde el visitante fue el ganador
        System.out.println("Partidos donde el visitante fue el ganador:");
        for (PartidoFutbol partido : partidos) {
            if (partido.getGoleVisitante() > partido.getGoleolocal()) {
                System.out.println(partido);
            }
        }

        // b) Contar cuantas veces gano el Sevilla
        int contadorSevilla = 0;
        for (PartidoFutbol partido : partidos) {
            if (partido.getEquipolocal().equals("Sevilla") && partido.getGoleolocal() > partido.getGoleVisitante()) {
                contadorSevilla++;
            }
            if (partido.getEquipoVisitante().equals("Sevilla") && partido.getGoleVisitante() > partido.getGoleolocal()) {
                contadorSevilla++;
            }
        }
        System.out.println("El Sevilla gano " + contadorSevilla + " veces.");

        // c) Eliminar partidos que no sean empates
        partidos.removeIf(partido -> partido.getGoleolocal() != partido.getGoleVisitante());
        System.out.println("Partidos despues de eliminar los no empates:");
        for (PartidoFutbol partido : partidos) {
            System.out.println(partido);
        }

        // d) Contar cuantos partidos gano el equipo local
        int contadorLocal = 0;
        for (PartidoFutbol partido : partidos) {
            if (partido.getGoleolocal() > partido.getGoleVisitante()) {
                contadorLocal++;
            }
        }
        System.out.println("El equipo local gano " + contadorLocal + " veces.");
    }
}

class PartidoFutbol {
    private String equipolocal;
    private String equipoVisitante;
    private int goleolocal;
    private int goleVisitante;

    public PartidoFutbol(String equipolocal, String equipoVisitante, int goleolocal, int goleVisitante) {
        this.equipolocal = equipolocal;
        this.equipoVisitante = equipoVisitante;
        this.goleolocal = goleolocal;
        this.goleVisitante = goleVisitante;
    }

    // Getters y toString
    public String getEquipolocal() { return equipolocal; }
    public String getEquipoVisitante() { return equipoVisitante; }
    public int getGoleolocal() { return goleolocal; }
    public int getGoleVisitante() { return goleVisitante; }

    @Override
    public String toString() {
        return equipolocal + " " + goleolocal + "-" + goleVisitante + " " + equipoVisitante;
    }
}