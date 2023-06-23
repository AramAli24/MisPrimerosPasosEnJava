/*
Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.
 */
package service;

import entities.Electrodomestico;
import entities.Lavadora;
import java.util.Scanner;

/**
 *
 * @author Ali
 */
public class LavadoraService extends Lavadora {
    
    public LavadoraService() {
    }
    
    public LavadoraService(Integer carga,double precio, String color, String consumo, Integer peso) {
        super(carga, precio, color, consumo, peso);
    }
    
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public Lavadora crearLavadora() {
        Electrodomestico e2 = super.crearElectrodomestico();
        Lavadora l = new Lavadora();
        System.out.println("Ingrese la carga de la lavadora");
        l.setCarga(read.nextInt());
        l.setPrecio(e2.getPrecio());
        l.setColor(e2.getColor());
        l.setConsumo(e2.getConsumo());
        l.setPeso(e2.getPeso());
        return l;
        
    }

    /*
    Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.
    <T> */
    public /* <T> */ void precioFinal(Lavadora l) {
        super.precioFinal(l);
        if (l.getCarga()>30) {
            l.setPrecio(l.getPrecio()+500);
        }
        System.out.println("el precio nuevo de la lavadora es de: $"+l.getPrecio());
    }
    
}
