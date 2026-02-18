/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atleticaRanasgallaAbenante;
import java.util.*;
/**
 *
 * @author ranasgalla.niccolo
 */
public class Lanciatore extends Atleta {

    public Lanciatore(String nome, int numero, String nazionalita, int prestazione, String tipoAtleta) {
        super(nome, numero, nazionalita, prestazione, tipoAtleta);
    }
    @Override
    public void sceltaGara(String tipoGara){
        if(tipoGara == "1"){
            calcoloPunteggioGiavellotto();
        }else if(tipoGara == "2"){
            calcoloPunteggioPeso();
        }else if(tipoGara == "4"){
            calcoloPunteggioDisco();
        }
    }
    private double calcoloPunteggioGiavellotto(){
        Random rnd = new Random();
        double punteggio = rnd.nextInt(100, 125);
        if(prestazione < 5){
            punteggio += rnd.nextInt(5) + 0.5;
        }else{
            punteggio -= rnd.nextInt(5) + 0.5;
        }
        return punteggio;
    }
    private double calcoloPunteggioPeso(){
        Random rnd = new Random();
        double punteggio = rnd.nextInt(150, 190);
        if(prestazione < 5){
            punteggio += rnd.nextInt(5) + 0.5;
        }else{
            punteggio -= rnd.nextInt(5) + 0.5;
        }
        return punteggio;
    }
    private double calcoloPunteggioDisco(){
        Random rnd = new Random();
        double punteggio = rnd.nextInt(60, 75);
        if(prestazione < 5){
            punteggio += rnd.nextInt(5) + 0.5;
        }else{
            punteggio -= rnd.nextInt(5) + 0.5;
        }
        return punteggio;
    }
}
