/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atleticaRanasgallaAbenante;

import java.util.ArrayList;

/**
 *
 * @author abenante.lucia
 */
public class GaraLancio extends Gara {

    public GaraLancio(ArrayList<Atleta> partecipanti, String nome) {
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
