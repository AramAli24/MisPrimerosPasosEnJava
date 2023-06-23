/*
A continuación, se debe crear una subclase llamada Lavadora, con el atributo carga,
además de los atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de los atributos heredados. Recuerda que debes
llamar al constructor de la clase padre.
 */
package entities;

import service.ElectrodomesticoService;

/**
 *
 * @author Ali
 */
public class Lavadora extends ElectrodomesticoService {

    private Integer carga;

    public Lavadora() {
    
    }

    public Lavadora(Integer carga) {
        this.carga = carga;
      
    }
  
    public Lavadora(Integer carga, double precio, String color, String consumo, Integer peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora{" + "carga=" + carga + '}'+super.toString();
    }

   
    
    
}
