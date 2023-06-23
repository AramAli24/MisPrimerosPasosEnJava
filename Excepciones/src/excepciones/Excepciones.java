/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
 */
package excepciones;

import entities.DivisionNumero;
import java.util.Scanner;

/**
 *
 * @author Ali
 */
public class Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
       //java.lang.ArrayIndexOutOfBoundsException
        try {
            int[] num = {1, 5, 9, 7};
            System.out.println("el numero es: " + num[4]);

        } catch (Exception e) {
            System.out.println("el array solo tiene 4 posiciones");
        }
         */

        Scanner read = new Scanner(System.in).useDelimiter("\n");
        DivisionNumero dc = new DivisionNumero();

        //java.lang.
        try {
            System.out.println("Ingrese el numero 1");
            dc.setN1(read.next());
            System.out.println("Ingrese el numero 2");
            dc.setN2(read.next());
            int n1, n2;
            n1 = Integer.parseInt(dc.getN1());
            n2 = Integer.parseInt(dc.getN2());
            System.out.println(n1 / n2);
        } catch (NumberFormatException a) {
            System.out.println("no se puede transformar string a int");

        } catch (ArithmeticException b) {
            System.out.println("no puedo dividir por cero");

            /*
        Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
        causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
         no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
        número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
        utilizando bloques try/catch para las distintas excepciones
             */
        }

    }

}
