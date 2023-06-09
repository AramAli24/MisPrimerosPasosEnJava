/*
Vamos a crear una clase Animal que tenga un método hacerRuido() que devuelva un saludo
“Hola”. Luego haremos clase Perro y clase Gato que extiendan de Animal y sobreescriban el
método hacerRuido() con el ruido que corresponda a cada uno. Luego, en el main vamos a crear
un ArrayList de animales y los siguientes animales
Animal a = new Animal();
Animal b = new Perro();
Animal c = new Gato();
Agregaremos a la lista a cada uno y luego, con un for each, recorreremos la lista llamando al
método hacerRuido() de cada ítem.
 */
package entitites;

/**
 *
 * @author Ali
 */
public class Dog extends Animal {

    public Dog() {
    }

    public Dog(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    
    @Override
    public void makeNoise(){
        System.out.println("dog: woof"); 
    }

    @Override
    public void Alimentarse() {
        super.Alimentarse(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
