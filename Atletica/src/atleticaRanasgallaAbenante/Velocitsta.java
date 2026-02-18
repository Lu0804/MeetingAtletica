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
public class Velocitsta extends Atleta {

    public Velocitsta(String nome, int numero, String nazionalita, int prestazione, String tipoAtleta) {
        super(nome, numero, nazionalita, prestazione, tipoAtleta);
        
    }
    @Override
    public void sceltaGara(String tipoGara){
        if(tipoGara == "1"){
           // calcoloPunteggio100();
        }else if(tipoGara == "2"){
           // calcoloPunteggio200();
        }else if(tipoGara == "4"){
          //  calcoloPunteggio400();
        }
    }
   
    
  
}
