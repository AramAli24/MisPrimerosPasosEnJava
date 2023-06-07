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
package service;

import entities.Movies;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Ali
 */
public class ServiceMovies {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    String ans;

    public void createMovies(ArrayList<Movies> ma) {
        do {

            Movies m = new Movies();

            System.out.println("Please, enter the name of the movie ");
            m.setTitle(read.next());

            System.out.println("Enter the name of the director of the movie " + m.getTitle());
            m.setDirector(read.next());
            System.out.println("Enter the lenght of the movie in minutes " + m.getTitle());
            m.setMlenght(read.nextInt());
            ma.add(m);
            System.out.println("Do you want to input another movie? Y/N");
            ans = read.next();
        } while (!ans.equalsIgnoreCase("n"));

    }

    public void showMovies(ArrayList<Movies> ma) {
        System.out.println(ma);

    }

    public void orderMovies(ArrayList<Movies> ma) {
        Iterator<Movies> it = ma.iterator();

        while (it.hasNext()) {
            Movies next = it.next();

            if (next.getMlenght() > 60) {
                System.out.println(next.toString());
            }
        }

    }
}
