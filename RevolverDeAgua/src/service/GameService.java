/*
llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.

10
• 
 */
package service;

import entities.Game;
import entities.Gun;
import entities.Player;
import java.util.ArrayList;

/**
 *
 * @author Ali
 */
public class GameService {
  Game game = new Game();
  
        
    public void LoadGame(ArrayList<Player>ps,Gun g ){
     game.setGun(g);
     game.setPs(ps);
     
     
    }
    /*
    ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
    */
    public void Round(){
        if (gs.wet) {
            
        }
       
    }
    
}
