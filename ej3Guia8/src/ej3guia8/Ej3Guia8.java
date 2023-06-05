/*Realizar una clase llamada Persona en el paquete de entidades que tengan 
los siguientes atributos: nombre, edad, sexo (‘H’ para hombre, ‘M’ para mujer,
‘O’ para otro), peso y altura. Si desea añadir algún otro atributo, puede hacerlo. 
Agregar constructores, getters y setters.
En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario
y después se le asignan a sus respectivos atributos para llenar el objeto Persona.
Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O. 
Si no es correcto se deberá mostrar un mensaje

Método calcularIMC(): calculara si la persona está en su peso ideal 
(peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, 
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), 
significa que la persona está en su peso ideal y la función devuelve un 0.
Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa
que la persona tiene sobrepeso, y la función devuelve un 1.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, 
llamaremos todos los métodos para cada objeto, deberá comprobar si la persona 
está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e 
indicar para cada objeto si la persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y
esMayorDeEdad en distintas variables(arrays), para después calcular un
porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas
en su peso ideal y cuantos, por encima, y también calcularemos un porcentaje
de cuantos son mayores de edad y cuantos menores. Para esto, podemos crear unos métodos adicionales.


 */
package ej3guia8;

import ej3guia8.entidades.Personas;
import ej3guia8.servicios.PersonasServicios;
import java.util.Arrays;

/**
 *
 * @author Ali
 */
public class Ej3Guia8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PersonasServicios ps = new PersonasServicios();
        Personas[] p = new Personas[4];
        int[] imc = new int[4];
        boolean[] edad = new boolean[4];
        double contPB = 0;
        double contPN = 0;
        double contPA = 0;
        double contMay = 0;
        double contMen = 0;
        
        for (int i = 0; i < 4; i++) {
            p[i] = ps.crearPersonas();
            imc[i] = ps.calcularIMC(p[i]);
            switch (imc[i]) {
                case -1:
                    System.out.println("Estas flaquito " + contPB++);
                   
                    break;
                case 0:
                    System.out.println("Estas bien "+ contPN++);
                    
                    break;
                default:
                    System.out.println("El 90% del cuerpo es agua asi que no estas gordo estas inundado "+contPA++);
                    
                    break;
            }
            edad[i] = ps.esMayorDeEdad(p[i]);
            if (edad[i]) {
                System.out.println("Es mayor de edad "+ contMay++);
               

            } else {
                System.out.println("Es menor de edad " + contMen++);
               
            }
            
        }
        /*
         int []imc2={2,0,1,2};
        
        boolean comp=Arrays.equals(imc, imc2);
        System.out.println(comp);
        
           int []imc2=new int  [4];
        Arrays.fill(imc2, 0);
        
        */
       
     
        
        
        System.out.println("............");
        System.out.println("Los porcentajes de peso son:");
        System.out.println("El porcentaje de las personas con peso bajo es: %" + (((contPB) / 4) * 100));
        System.out.println("El porcentaje de las personas con peso normal es: %" + (((contPN) / 4) * 100));
        System.out.println("El porcentaje de las personas con peso alto es: %" + (((contPA) / 4) * 100));
        System.out.println("............");
        System.out.println("Los porcentajes de edades son:");
        System.out.println("El porcentaje de menores de edad es : %" + (((contMen)/4)*100));
        System.out.println("El porcentaje de mayores de edad es : %" + (((contMay)/4)*100));
    }

    /*
     public static void pruebitas(){
        
    }
    */
   
    
    
}
