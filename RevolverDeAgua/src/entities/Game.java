/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


/**
 *
 * @author Ali
 */
public class Game {
    private ArrayList<Player> ps;
    private Gun gun;

    public Game() {
    }

    public Game(ArrayList<Player> ps, Gun gun) {
        this.ps = ps;
        this.gun = gun;
    }

    public ArrayList<Player> getPs() {
        return ps;
    }

    public void setPs(ArrayList<Player> ps) {
        this.ps = ps;
    }

    public Gun getGun() {
        return gun;
    }

    public void setGun(Gun gun) {
        this.gun = gun;
    }

    @Override
    public String toString() {
        return "Game{" + "ps=" + ps + ", gun=" + gun + '}';
    }

   
    
    
}
