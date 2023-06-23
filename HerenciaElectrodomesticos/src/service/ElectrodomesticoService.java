/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entities.Electrodomestico;
import java.util.Scanner;

/**
 *
 * @author Ali
 */
public class ElectrodomesticoService extends Electrodomestico {

    private Scanner read = new Scanner(System.in).useDelimiter("\n");

    public ElectrodomesticoService() {
    }

    public ElectrodomesticoService(double precio, String color, String consumo, Integer peso) {
        super(precio, color, consumo, peso);
    }

    /*
    • Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.
     */
    public Electrodomestico crearElectrodomestico() {
        Electrodomestico e = new Electrodomestico();
        System.out.println("Bienvenido");
        System.out.println("El precio se setea automaticamente");
        e.setPrecio(1000);
        System.out.println("Ingrese el color");
        e.setColor(read.next());
        this.comprobarColor(e);
        System.out.println("Ingrese el consumo energetico");
        e.setConsumo(read.next());
        this.comprobarConsumoEnergetico(e);
        System.out.println("Ingrese el peso del electrodometico en kg");
        e.setPeso(read.nextInt());
        return e;

    }

    /*  • Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.
     */
    public void comprobarConsumoEnergetico(Electrodomestico e) {
        String aux = e.getConsumo();
        if (aux.equalsIgnoreCase("a") || aux.equalsIgnoreCase("b") || aux.equalsIgnoreCase("c") || aux.equalsIgnoreCase("d") || aux.equalsIgnoreCase("e") || aux.equalsIgnoreCase("f")) {
            System.out.println("consumo guardado");
        } else {
            System.out.println("la letra es incorrecta, se llenara en f");
            e.setConsumo("f");
            System.out.println("consumo guardado");

        }
    }

    /*
    Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.
     */
    public void comprobarColor(Electrodomestico e) {
        String aux = e.getColor();
        if (aux.equalsIgnoreCase("blanco") || aux.equalsIgnoreCase("negro") || aux.equalsIgnoreCase("rojo") || aux.equalsIgnoreCase("azul") || aux.equalsIgnoreCase("gris")) {
            System.out.println("color guardado");
        } else {
            e.setColor("blanco");
            System.out.println("color incompatible se guardara en blanco");
        }
    }

    /*
    Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:
    LETRA PRECIO
A $1000
B $800
C $600
D $500
E $300
F $100
    <T> */
    public void precioFinal(Electrodomestico e) {
        switch (e.getConsumo()) {
            case "a":
                e.setPrecio(e.getPrecio() + 1000);
                break;
            case "b":
                e.setPrecio(e.getPrecio() + 800);
                break;
            case "c":
                e.setPrecio(e.getPrecio() + 600);
                break;
            case "d":
                e.setPrecio(e.getPrecio() + 500);
                break;
            case "e":
                e.setPrecio(e.getPrecio() + 300);
                break;
            case "f":
                e.setPrecio(e.getPrecio() + 100);
                break;
        }
        /*
        PESO PRECIO
        Entre 1 y 19 kg $100
        Entre 20 y 49 kg $500
        Entre 50 y 79 kg $800
        Mayor que 80 kg $1000
         */
        if (e.getPeso() >= 1 && e.getPeso() <= 19) {
            e.setPrecio(e.getPrecio() + 100);
        } else if (e.getPeso() >= 20 && e.getPeso() <= 49) {
            e.setPrecio(e.getPrecio() + 500);
        } else if (e.getPeso() >= 50 && e.getPeso() <= 79) {
            e.setPrecio(e.getPrecio() + 800);
        } else if (e.getPeso() >= 80) {
            e.setPrecio(e.getPrecio() + 1000);
        }

    }
}
