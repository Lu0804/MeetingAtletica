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
public class GaraCorsa extends Gara implements IPunteggio, ITempoReazione {

    private Random rnd = new Random();
    
    private int range1, range2;

    public GaraCorsa(ArrayList<Atleta> partecipanti, String nome, int range1, int range2) {
        super(partecipanti, nome);
        this.range1 = range1;
        this.range2 = range2;
    }

   @Override
    public String graduatoria() {
        // Controlla preliminare
        if (partecipanti.isEmpty()) {// se è vuoto manda un messaggio e fa un return vuoto
            return "Nessun partecipante iscritto";
        }
        
        // Chiama  metodo per calcolare (ritorna l'array dei punteggi)
        double[] punteggi = calcolaTuttiPunteggi(); //crea un array grande quanto sono i partecipanti 
        
        //C hiama il metodo per ordinare (modifica sia l'array che la lista)
        ordinaClassifica(punteggi); //crea un array grande quanto sono i partecipanti
        
        //restituisce la classifica con i punteggi
        return stampaClassifica(punteggi);
    }


    private double[] calcolaTuttiPunteggi() {
        double[] punteggiTemp = new double[partecipanti.size()]; //crea un array grande quanto sono i partecipanti 
         // Calcola punteggio per ogni atleta
        for (int i = 0; i < partecipanti.size(); i++) {
            punteggiTemp[i] = calcoloPunteggioCorsa(partecipanti.get(i), range1, range2);
        }
        return punteggiTemp;//fa il return dell'array
    }

    
    
    private void ordinaClassifica(double[] punteggi) {
        for (int i = 0; i < partecipanti.size() - 1; i++) {
            for (int j = 0; j < partecipanti.size() - i - 1; j++) {
                
                // Ordine crescente
                if (punteggi[j] > punteggi[j + 1]) { //confronta i due in poizione i e j 
                    
                    // Scambia punteggi
                    double tempPunt = punteggi[j];//salva la variabile più piccola
                    punteggi[j] = punteggi[j + 1];
                    punteggi[j + 1] = tempPunt;

                    // Scambia Atleti (sincronizzato col punteggio)
                    Atleta tempAtl = partecipanti.get(j);//salva latleta con il punteggio più piccolo
                    partecipanti.set(j, partecipanti.get(j + 1));
                    partecipanti.set(j + 1, tempAtl);
                }
            }
        }
    }

    // stampa
    private String stampaClassifica(double[] punteggi) {
        String testo = "Classifica " + super.getNome() + "\n\n";
        for (int i = 0; i < partecipanti.size(); i++) {
            Atleta a = partecipanti.get(i);
            testo += String.format("%d° %s (n.%d) - %.2f\n", i + 1, a.getNome(), a.getNumero(), punteggi[i]);
        }
        return testo;
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

    @Override
    public double calcoloReazione() {
        double reazione = rnd.nextDouble(0.13, 0.15);
        return reazione;
    }

    public double calcolo(Atleta a, double punteggio, Random rnd) {
        if (a.getPrestazione() < 5) {
            punteggio += rnd.nextInt(5) + 0.5 + calcoloReazione();
        } else {
            punteggio -= rnd.nextInt(5) + 0.5 + calcoloReazione();
        }
        return punteggio;
    }
}
