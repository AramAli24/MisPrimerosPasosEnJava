/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitites;

/**
 *
 * @author Ali
 */
public class Horse extends Animal {

    public Horse() {
    }

    public Horse(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void Alimentarse() {
        super.Alimentarse(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
