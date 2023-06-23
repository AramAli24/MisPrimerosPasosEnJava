/*
 Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.
 */
package entities;

import service.ElectrodomesticoService;

/**
 *
 * @author Ali
 */
public class Televisor extends ElectrodomesticoService {

    /*
    porque asi tiene los atributos de electrodomestico y los metodos e electrodomestico service
     */
    private Integer resolucion;
    private boolean TDT;

    public Televisor() {
    }

    public Televisor(Integer resolucion, boolean TDT) {
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public Televisor(Integer resolucion, boolean TDT, double precio, String color, String consumo, Integer peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }

    @Override
    public String toString() {
        return "Televisor{" + "resolucion=" + resolucion + ", TDT=" + TDT + '}'+super.toString();
    }

       
}
