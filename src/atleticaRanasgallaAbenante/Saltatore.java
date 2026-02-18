/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atleticaRanasgallaAbenante;

import java.util.Random;

/**
 *
 * @author ranasgalla.niccolo
 */
public class Saltatore extends Atleta{

    public Saltatore(String nome, int numero, String nazionalita, int prestazione, String tipoAtleta) {
        super(nome, numero, nazionalita, prestazione, tipoAtleta);
    }
    @Override
    public void sceltaGara(String tipoGara){
        if(tipoGara == "1"){
            calcoloPunteggioSaltoAlto();
        }else if(tipoGara == "2"){
            calcoloPunteggioSaltoLungo();
        }
    }
    private double calcoloPunteggioSaltoAlto(){
        Random rnd = new Random();
        double punteggio = rnd.nextInt(180, 200);
        if(prestazione < 5){
            punteggio += rnd.nextInt(5) + 0.5;
        }else{
            punteggio -= rnd.nextInt(5) + 0.5;
        }
        return punteggio;
    }
    private double calcoloPunteggioSaltoLungo(){
        Random rnd = new Random();
        double punteggio = rnd.nextInt(100, 170);
        if(prestazione < 5){
            punteggio += rnd.nextInt(5) + 0.5;
        }else{
            punteggio -= rnd.nextInt(5) + 0.5;
        }
        return punteggio;
    }
}
