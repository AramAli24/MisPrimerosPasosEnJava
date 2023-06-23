/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaelectrodomesticos;

import entities.Electrodomestico;
import entities.Lavadora;
import entities.Televisor;
import service.ElectrodomesticoService;
import service.LavadoraService;
import service.TelevisorService;

/**
 *
 * @author Ali
 */
public class HerenciaElectrodomesticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ElectrodomesticoService es = new ElectrodomesticoService();
        System.out.println("Creamos electrodomestico");
        Electrodomestico e = es.crearElectrodomestico();
        System.out.println("el elctro es");
        System.out.println(e.toString());
        es.precioFinal(e);

        LavadoraService ls = new LavadoraService();
        System.out.println("Creamos lavadora");
        Lavadora l = ls.crearLavadora();
        System.out.println("la lavadora es");
        System.out.println(l.toString());
        ls.precioFinal(l);

        TelevisorService ts = new TelevisorService();
                
        System.out.println("Creamos tv");
        Televisor t = ts.crearTelevisor();
        System.out.println("la tv es");
        System.out.println(t.toString());
        ts.precioFinal(t);

    }

}
