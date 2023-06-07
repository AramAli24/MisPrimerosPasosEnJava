/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import entities.Movies;
import java.util.Comparator;

/**
 *
 * @author Ali
 */
public class Comparators {
   public static Comparator<Movies> ordenarPorDuracionMayor = new Comparator<Movies>() {
        @Override
        public int compare(Movies t, Movies t1) {
            
            return t1.getMlenght().compareTo(t.getMlenght());
        }
    }; 
   //comparar t a t1
   
    public static Comparator<Movies> ordenarPorDuracionMenor = new Comparator<Movies>() {
        @Override
        public int compare(Movies t, Movies t1) {
            
            return t.getMlenght().compareTo(t1.getMlenght());
        }
    };
    
    public static Comparator<Movies> ordenarPorDirector = new Comparator<Movies>() {
        @Override
        public int compare(Movies t, Movies t1) {
            
            return t.getDirector().compareTo(t1.getDirector());
        }
    };
    public static Comparator<Movies> ordenarPorPeli = new Comparator<Movies>() {
        @Override
        public int compare(Movies t, Movies t1) {
            
            return t.getDirector().compareTo(t1.getDirector());
        }
    };
}
