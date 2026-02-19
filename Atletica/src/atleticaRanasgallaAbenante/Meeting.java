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
/**
 * costruttore
 * @param gare arrayList delle gare 
 */
    public Meeting(ArrayList<Gara> gare) {
        this.gare = gare;
    }
    
    /**
     * metodo che aggiunge la gara all'arrayList
     * @param gara 
     */
    public void aggiungiGara(Gara gara){
        Errore r = new Errore();
        r.duplicatiGare(gara, gare);
    }
    /**
     * metodo get per le gare 
     * @return arraylist gare
     */
    public ArrayList<Gara> getGare() {
        return gare;
    }
}
