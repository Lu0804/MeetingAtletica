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
public class GaraCorsa extends Gara implements IPunteggio{

    private Random rnd = new Random();

    public GaraCorsa(ArrayList<Atleta> partecipanti, String nome) {
        super(partecipanti, nome);
    }

    @Override
    public void graduatoria() {

    }

    @Override
    public void iscrizione(Atleta a) {
        if (partecipanti.contains(a)) {
        } else {
            partecipanti.add(a);
        }

    }

    @Override
    /**
     *
     * @param a atleta per prendere la prestazione
     * @param range1 rannge minimo
     * @param range2 range massimo
     * @return tempo della corsa
     */
    public double calcoloPunteggioCorsa(Atleta a, int range1, int range2) {

        double punteggio = rnd.nextInt(range1, range2);
        return calcolo(a, punteggio, rnd);
    }

    public double calcolo(Atleta a, double punteggio, Random rnd) {
        if (a.getPrestazione() < 5) {
            punteggio += rnd.nextInt(5) + 0.5;
        } else {
            punteggio -= rnd.nextInt(5) + 0.5;
        }
        return punteggio;
    }
}
