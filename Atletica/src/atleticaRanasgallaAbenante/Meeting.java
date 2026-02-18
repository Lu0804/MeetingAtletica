/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atleticaRanasgallaAbenante;
import java.util.*;
/**
 *
 * @author utente
 */
public class Meeting {
    private ArrayList<Gara> gare;

    public Meeting(ArrayList<Gara> gare) {
        this.gare = gare;
    }
    public void aggiungiGara(Gara gara){
        Errore r = new Errore();
        r.duplicatiGare(gara, gare);
    }
    
}
