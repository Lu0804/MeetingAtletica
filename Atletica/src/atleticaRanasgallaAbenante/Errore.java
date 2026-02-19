/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atleticaRanasgallaAbenante;
import java.util.*;

import javax.swing.JTextField;
/**
 *
 * @author utente
 */

public class Errore {

    public Errore(){
        
    }
    

    /**
     * metodo per il controllo duplicazione di atletli
     *
     * @param a atleta
     * @param p array dei partecipanti
     */
    public void duplicatiAtleta(Atleta a, ArrayList<Atleta> p) {
        if (p.contains(a)) {
            System.out.println("DUPLICATO");
        } else {
            p.add(a);
        }
    }

    /**
     * metodo per il controllo duplicazione di atletli
     *
     * @param g gara
     * @param p array dei partecipanti
     */
    public void duplicatiGare(Gara g, ArrayList<Gara> p) {
        if (p.contains(g)) {
            System.out.println("DUPLICATO");
        } else {
            p.add(g);
        }
    }

    /**
     * metodo per il controllo il nome
     *
     * @return true se c'è un errore, false se è valido
     */
    public boolean erroreNome(JTextField txtNome) {
        String nome = txtNome.getText();
        // Controlla che nome non sia vuoto e contenga solo numeri ("\\d+") prima di convertirlo 
        if (nome.isEmpty() || nome.matches(".*\\d.*")) {
            return true; // Vero = c'è un errore
        }
        return false; // Falso = nessun errore
    }

    /**
     * metodo per il controllo del numero maglia
     *
     * @return true se c'è un errore, false se è valido
     */
    public boolean erroreNumero(JTextField txtNumero) {
        String numeroText = txtNumero.getText();
        // Controlla subito se è vuoto o se contiene qualcosa di diverso da numeri (\d+)
        if (numeroText.isEmpty() || !numeroText.matches("\\d+")) {
            return true;
        }

        int numero = Integer.parseInt(numeroText);
        if (numero <= 0) { //Numero maglia deve essere maggiore di 0
            return true;
        }
        return false;
    }

    /**
     * metodo per il controllo della nazionalità
     *
     * @return true se c'è un errore, false se è valido
     */
    public boolean erroreNazionalita(JTextField txtNazionalita) {
        String nazionalita = txtNazionalita.getText();
        // Controlla che nazionalita non sia vuoto e contenga solo numeri ("\\d+") prima di convertirlo 
        if (nazionalita.isEmpty() || nazionalita.matches(".*\\d.*")) {
            return true;
        }
        return false;
    }

    /**
     *metodo per il controllo della Prestazione
     *
     * @return true se c'è un errore, false se è valido
     */
    public boolean errorePrestazione(JTextField txtPrestazione) {
        String prestazioneText = txtPrestazione.getText().trim();
        // Controlla che prestazione non sia vuoto e contenga solo numeri ("\\d+") prima di convertirlo 
        if (prestazioneText.isEmpty() || !prestazioneText.matches("\\d+")) {
            return true;
        }

        int prestazione = Integer.parseInt(prestazioneText);
        if (prestazione <= 0 || prestazione >= 10) { //La Prestazione deve essere compresa tra 1 e 10 
            return true;
        }
        return false;
    }
}

