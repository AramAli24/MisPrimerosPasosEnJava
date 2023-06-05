/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minutosahoras;

import java.util.Scanner;

/**
 *
 * @author Ali
 */
public class MinutosAHoras {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la cantidad de minutos");
        int min = leer.nextInt();
        int horas, dias;
        dias = (min/24);
        
        do {
            System.out.println("La cantidad de minutos equivale a: " + dias + "dias" );
        } while (true);
        
    }
}
