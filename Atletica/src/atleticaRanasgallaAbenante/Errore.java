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
public class Errore {
    public void duplicatiAtleta(Atleta a, ArrayList<Atleta> p){
        if(p.contains(a)) System.out.println("DUPLICATO");
        else{
            p.add(a);
        }   
    }
    public void duplicatiGare(Gara g, ArrayList<Gara> p){
        if(p.contains(g)) System.out.println("DUPLICATO");
        else{
            p.add(g);
        }
    }
    
}
