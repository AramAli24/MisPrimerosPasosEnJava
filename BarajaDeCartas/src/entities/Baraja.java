/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
 */
package entities;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Ali
 */
public class Baraja {

    private Scanner read = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Carta> barajaCartas;
    private ArrayList<Carta> cartasRepartidas = new ArrayList();
    private int cont = 0;

    public void menu() {
        int opcion = 0;
        do {
            System.out.println("---Cartas---");
            System.out.println("Elegí");
            System.out.println("1- Mezclar.");
            System.out.println("2- Mostrar cartas disponibles.");
            System.out.println("3- Repartir.");
            System.out.println("4- Mostrar todas las cartas.");
            System.out.println("5- Mostrar cartas ya usadas.");
            System.out.println("SIG CARTA");
            System.out.println("7- Salir");
            System.out.println("");
            opcion = read.nextInt();
            switch (opcion) {
                case 1:
                    barajar();
                    break;
                case 2:
                    cartasDisponibles();
                    break;
                case 3:
                    darCartas();
                    break;
                case 4:
                    mostrarBaraja();
                    break;

                case 5:
                    cartasMonton();
                    break;
                case 6:
                    siguienteCarta();
                    break;
                case 7:

                    System.out.println("Gracias por jugar ameo :)");
                    break;
            }
        } while (opcion < 7);
    }

    public Baraja() {
        barajaCartas = new ArrayList();
        String[] palo = {"ESPADAS", "BASTOS", "OROS", "COPAS"};
        int[] numeracion = {1, 2, 3, 4, 5, 6, 7, 10, 11, 12};//del 0 al 9

        for (int i = 0; i < 4; i++) {
            //recorro palo
            String auxPalo = palo[i];
            for (int j = 0; j < 10; j++) {
                //recorro numeracion
                int auxNum = numeracion[j];
                barajaCartas.add(new Carta(auxNum, auxPalo));
            }

        }
    }

// barajar(): cambia de posición todas las cartas aleatoriamente.
    public void barajar() {
        Collections.shuffle(barajaCartas);

    }
//siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
    //se haya llegado al final, se indica al usuario que no hay más cartas.

    public void siguienteCarta() {

        Iterator<Carta> it = barajaCartas.iterator();
       // while (it.hasNext()) {
           // barajaCartas.get(1).toString();
           // cont++;
         //   Carta aux = it.next();
            System.out.println(barajaCartas.get(0).toString());

            cartasRepartidas.add(barajaCartas.get(0));
            barajaCartas.remove(0);
            if (cont > 40) {
                System.out.println("No hay mas cartas en la baraja");
              // break;
            }
       // }
    }

    //cartasDisponibles(): indica el número de cartas que aún se puede repartir.
    public void cartasDisponibles() {
        System.out.println("Las cartas disponibles son: " + (barajaCartas.size()));

    }

    /*
    darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
     */
    public void darCartas() {
        System.out.println("Cuantas cartas quiere pedir?");
        int cantCards = read.nextInt();
        if (barajaCartas.size() > cantCards) {
            for (int i = 0; i < cantCards; i++) {
                siguienteCarta();
                //siempre es 0 y no i porque al sacar una carta la carta restante cae en el lugar 0
                /* System.out.println(barajaCartas.get(0).toString());
                barajaCartas.remove(0);
                cartasRepartidas.add(barajaCartas.get(0));
               
               
                 */

            }

        } else {
            System.out.println("no hay mas cartas");
        }

    }

    /*
    cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
     */
    public void cartasMonton() {
        Iterator<Carta> it2 = cartasRepartidas.iterator();
        boolean band = false;
        //System.out.println(cartasRepartidas);
        while (it2.hasNext()) {
            Carta next = it2.next();

            System.out.println(next.toString());
            band = true;
        }
        if (band == false) {
            System.out.println("Todavia no se han dado cartas");
        }
    }

    //mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
//luego se llama al método, este no mostrara esa primera carta.
    public void mostrarBaraja() {
        System.out.println(barajaCartas);

    }
}
/*public Ejercicio3Baraja siguienteCarta(ArrayList<Ejercicio3Baraja> baraja) {
        Ejercicio3Baraja carta = baraja.get(0);
        salieron.add(carta);
        baraja.remove(0);
        return baraja.get(0)



    }*/
