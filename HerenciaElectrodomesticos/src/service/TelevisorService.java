/*
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.

 */
package service;

import entities.Electrodomestico;
import entities.Televisor;
import java.util.Scanner;

/**
 *
 * @author Ali
 */
public class TelevisorService extends Televisor {

    public TelevisorService() {

    }

    public TelevisorService(Integer resolucion, boolean TDT, double precio, String color, String consumo, Integer peso) {
        super(resolucion, TDT, precio, color, consumo, peso);
    }
    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Televisor crearTelevisor() {
        Electrodomestico e2 = super.crearElectrodomestico();
   
        Televisor t = new Televisor();
        System.out.println("Ingrese la resolucion de la tv");
        t.setResolucion(read.nextInt());
        System.out.println("La tv tiene TDT? s/n");
        String aux = read.next();
        if (aux.equalsIgnoreCase("s")) {
            t.setTDT(true);
        } else if (aux.equalsIgnoreCase("n")) {
            t.setTDT(false);
        }

        t.setPrecio(e2.getPrecio());
        t.setColor(e2.getColor());
        t.setConsumo(e2.getConsumo());
        t.setPeso(e2.getPeso());
        System.out.println(t.toString());
        return t;

    }

    /*
    public Televisor crearTelevisor(){
        Electrodomestico e2 = super.crearElectrodometico();
        Televisor t = new Televisor();
        System.out.println("Ingrese la resolucion de la tv" );
        t.setResolucion(read.nextInt());
        
        System.out.println("La tv tiene TDT? s/n");
        String aux = read.next();
        if (aux.equalsIgnoreCase("s")) {
            t.setTDT(true);
        }else if(aux.equalsIgnoreCase("n")){
            t.setTDT(false);
        }
        t.setPrecio(e2.getPrecio());
        t.setColor(e2.getColor());
        t.setConsumo(e2.getConsumo());
        t.setPeso(e2.getPeso());
        return t;
    }
     */
 /*
    • Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
     */
    public void precioFinal(Televisor t) {
        super.precioFinal(t);
        if (t.getResolucion() > 40) {
            double aux = t.getPrecio() * 0.30;
            t.setPrecio(t.getPrecio() + aux);
        }
        if (t.isTDT() == true) {
            t.setPrecio(t.getPrecio() + 500);
        }
    }

}
