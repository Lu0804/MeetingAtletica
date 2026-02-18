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
public class GaraLancio extends Gara implements IPunteggio {

    private Random rnd = new Random();

    public GaraLancio(ArrayList<Atleta> partecipanti, String nome) {
        super(partecipanti, nome);
    }

   @Override
    public void graduatoria() {
        // Controlla preliminare
        if (partecipanti.isEmpty()) {// se è vuoto manda un messaggio e fa un return vuoto
            System.out.println("Nessun partecipante iscritto");
            return;
        }

        // Chiama  metodo per calcolare (ritorna l'array dei punteggi)
        double[] punteggi = calcolaTuttiPunteggi(); //crea un array grande quanto sono i partecipanti 

        //Chiama il metodo per ordinare (modifica sia l'array che la lista)
        ordinaClassifica(punteggi); //crea un array grande quanto sono i partecipanti 

        // Chiama il metodo per stampare
        stampaClassifica(punteggi);
    }


    private double[] calcolaTuttiPunteggi() {
        double[] punteggiTemp = new double[partecipanti.size()]; //crea un array grande quanto sono i partecipanti 
         // Calcola punteggio per ogni atleta
        for (int i = 0; i < partecipanti.size(); i++) {
            punteggiTemp[i] = calcoloPunteggioCorsa(partecipanti.get(i), 9, 13);
        }
        return punteggiTemp;//fa il return dell'array
    }

    
    
    private void ordinaClassifica(double[] punteggi) {
        for (int i = 0; i < partecipanti.size() - 1; i++) {
            for (int j = 0; j < partecipanti.size() - i - 1; j++) {
                
                // Ordine crescente
                if (punteggi[j] < punteggi[j + 1]) { //confronta i due in poizione i e j 
                    
                    // Scambia punteggi
                    double tempPunt = punteggi[j];//salva la variabile più grande
                    punteggi[j] = punteggi[j + 1];
                    punteggi[j + 1] = tempPunt;

                    // Scambia Atleti (sincronizzato col punteggio)
                    Atleta tempAtl = partecipanti.get(j);//salva latleta con il punteggio più grande
                    partecipanti.set(j, partecipanti.get(j + 1));
                    partecipanti.set(j + 1, tempAtl);
                }
            }
        }
    }

    // stampa
    private void stampaClassifica(double[] punteggi) {
        System.out.println("Classifica Gara Lancio " + super.getNome() + " ");
        for (int i = 0; i < partecipanti.size(); i++) {
            Atleta a = partecipanti.get(i);
            // stampa atleta e punteggio
            System.out.printf(" Classificato:   | Punteggio: \n", 
                              (i + 1), a.getNome(), a.getNumero(), a.getNome(), punteggi[i]);
        }
    }

    @Override
    public void iscrizione(Atleta a) {
         Errore r= new Errore ();
        r.duplicatiAtleta(a, partecipanti);


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
