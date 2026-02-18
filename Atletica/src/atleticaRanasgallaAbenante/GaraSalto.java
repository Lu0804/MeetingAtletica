/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atleticaRanasgallaAbenante;

import java.util.ArrayList;

/**
 *
 * @author ranasgalla.niccolo
 */
public class GaraSalto extends Gara {

    public GaraSalto(ArrayList<Atleta> partecipanti, String nome) {
        super(partecipanti, nome);
    }
    
    
   @Override 
    public void graduatoria(){
        
    }
    
    @Override
    public void iscrizione(Atleta a){
        if(partecipanti.contains(a)){}
        else partecipanti.add(a);
        
    }
}
