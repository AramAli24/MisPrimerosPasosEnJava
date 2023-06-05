/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contraseñadesimbolosvalidador;

import java.util.Scanner;

/**
 *
 * @author Ali
 */
public class ContraseñaDeSimbolosValidador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int lon;
        String secuencia;
        int contc = 0;
        int inc = 0;

        do {
            System.out.println("Escriba secuencias de hasta 5 caracteres");
            secuencia = leer.nextLine();
            lon = secuencia.length();
            String letra = secuencia.substring(0, 1);
            String letra1 = secuencia.substring(lon - 1, lon);
            if (lon <= 5 && letra.equals("X") && letra1.equals("O")) {
                contc = contc + 1;
            } else {
                if (secuencia.equals("&&&&&")) {

                } else {
                    inc++;

                }
            }
        } while (!secuencia.equals("&&&&&"));
        System.out.println("los correctos son=" + contc);
        System.out.println("los incorrectos son= " + inc);
    }
}
