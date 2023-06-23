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


-------------------------------------------------------------


Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:

 */
package animalherencia;

import entitites.Animal;
import entitites.Cat;
import entitites.Dog;
import entitites.Horse;
//import java.util.ArrayList;

/**
 *
 * @author Ali
 */
public class AnimalHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* ArrayList<Animal> animals = new ArrayList();
       
       
       Animal a = new Animal();
       Animal b = new Dog();
       Animal c = new Cat();
       
       
       //Agregaremos a la lista a cada uno
       animals.add(a);
       animals.add(b);
       animals.add(c);
       
       
       
       // recorreremos la lista llamando al método hacerRuido() de cada ítem.
        for (Animal animal : animals) {
            animal.makeNoise();
        }
         */
        Animal dog1 = new Dog("Stich", "Carnivoro", 15, "Doberman");
        dog1.Alimentarse();

        Animal dog2 = new Dog("Teddy", "Croquetas", 10, "Chiguagua");
        dog2.Alimentarse();
        Animal cat1 = new Cat("Pelusa", "Galletas", 15, "Ciames");
        cat1.Alimentarse();
        Animal horse1 = new Horse("Spark", "Pasto", 25, "Fino");
        horse1.Alimentarse();
    }
}
