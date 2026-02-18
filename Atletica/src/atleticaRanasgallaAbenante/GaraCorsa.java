/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atleticaRanasgallaAbenante;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author abenante.lucia
 */
public class GaraCorsa extends Gara implements IPunteggio200, IPunteggio400, IPunteggio100{

    public GaraCorsa(ArrayList<Atleta> partecipanti, String nome) {
        super(partecipanti, nome);
    }
    
    @Override 
    public void graduatoria (){
        
    }
    
     @Override
    public void iscrizione(Atleta a){
        if(partecipanti.contains(a)){}
        else partecipanti.add(a);
        
    }
    
    @Override 
    public double calcoloPunteggio100(Atleta a){
        
        Random rnd = new Random();
        double punteggio = rnd.nextInt(9, 13);
        if(a.getPrestazione() < 5){
            punteggio += rnd.nextInt(5) + 0.5;
        }else{
            punteggio -= rnd.nextInt(5) + 0.5;
        }
      return punteggio;
    }
     @Override 
    public double calcoloPunteggio200(Atleta a){
        Random rnd = new Random();
        double punteggio = rnd.nextInt(10, 22);
        if(a.getPrestazione() < 5){
            punteggio += rnd.nextInt(5) + 0.5;
        }else{
            punteggio -= rnd.nextInt(5) + 0.5;
        }
        return punteggio;
    }
    
     @Override  
    public double calcoloPunteggio400(Atleta a){
        Random rnd = new Random();
        double punteggio = rnd.nextInt(44, 60);
        if(a.getPrestazione() < 5){
            punteggio += rnd.nextInt(5) + 0.5;
        }else{
            punteggio -= rnd.nextInt(5) + 0.5;
        }
        return punteggio;
    }
}
