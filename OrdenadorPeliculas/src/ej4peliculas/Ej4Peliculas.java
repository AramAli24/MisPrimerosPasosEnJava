/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:



• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package ej4peliculas;

import entities.Movies;
import java.util.ArrayList;
import java.util.Collections;
import service.ServiceMovies;
import static utilities.Comparators.ordenarPorDirector;
import static utilities.Comparators.ordenarPorDuracionMayor;
import static utilities.Comparators.ordenarPorDuracionMenor;
import static utilities.Comparators.ordenarPorPeli;

/**
 *
 * @author Ali
 */
public class Ej4Peliculas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiceMovies sm = new ServiceMovies();
        ArrayList<Movies> ma = new ArrayList();

        sm.createMovies(ma);
        System.out.println("All the movies added are ");
        sm.showMovies(ma);
        System.out.println("*******");
        System.out.println("The movies longer than an hour are:");
        sm.orderMovies(ma);
        Collections.sort(ma, ordenarPorDuracionMayor);
        System.out.println("Las peliculas por duracion de mayor a menor son:");
        System.out.println(" " + ma);
        Collections.sort(ma, ordenarPorDuracionMenor);
        System.out.println("Las peliculas por duracion de menor a mayor son:");
        System.out.println(ma);
        Collections.sort(ma, ordenarPorDirector);
        System.out.println("La peliculas ordenadas alfabeticamente por nombrede director ");
        System.out.println(ma);
        Collections.sort(ma, ordenarPorPeli);
        System.out.println("La peliculas ordenadas alfabeticamente por titulo ");
        System.out.println(ma);
    }

}
