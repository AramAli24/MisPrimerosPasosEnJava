/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
 */
package entities;

/**
 *
 * @author Ali
 */
public class DivisionNumero {
 private String n1;
 private  String n2;

    public DivisionNumero() {
    }

  
    public DivisionNumero(String n1, String n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public String getN1() {
        return n1;
    }

    public void setN1(String n1) {
        this.n1 = n1;
    }

    public String getN2() {
        return n2;
    }

    public void setN2(String n2) {
        this.n2 = n2;
    }
   
  
   
}
