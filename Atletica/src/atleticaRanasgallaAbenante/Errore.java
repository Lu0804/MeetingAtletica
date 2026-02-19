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

    String messaggio;

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
     * Valida il campo nome
     *
     * @param txtNome campo di testo del nome
     * @return true se valido, false altrimenti
     */
    public boolean erroreNome(JTextField txtNome) {
        String nome = txtNome.getText();
        if (nome.isEmpty() || nome.matches(".*\\d.*")) {
            messaggio = "Il campo Nome non può essere vuoto!";

            return false;
        }

        return true;
    }

    package atleticaRanasgallaAbenante;

import java.util.ArrayList;
import javax.swing.JTextField;

public class Errore {

    String messaggio;

    // ... (i metodi duplicatiAtleta e duplicatiGare vanno bene così come li hai scritti) ...

    /**
     * Valida il campo nome
     *
     * @return true se c'è un ERRORE, false se è valido
     */
    public boolean erroreNome(JTextField txtNome) {
        String nome = txtNome.getText().trim();
        if (nome.isEmpty() || nome.matches(".*\\d.*")) {
            messaggio = "Il campo Nome non può essere vuoto o contenere numeri!";
            txtNome.requestFocus();
            return true; // Vero = c'è un errore
        }
        return false; // Falso = nessun errore
    }

    /**
     * Valida il campo numero
     *
     * @return true se c'è un ERRORE, false se è valido
     */
    public boolean erroreNumero(JTextField txtNumero) {
        String numeroText = txtNumero.getText().trim();
        // Controlla subito se è vuoto o se contiene qualcosa di diverso da numeri (\d+)
        if (numeroText.isEmpty() || !numeroText.matches("\\d+")) {
            messaggio = "Il campo Numero maglia non è valido (inserisci solo numeri interi)!";
            txtNumero.requestFocus();
            return true;
        }
        
        int numero = Integer.parseInt(numeroText);
        if (numero <= 0) {
            messaggio = "Il campo Numero maglia deve essere maggiore di 0!";
            txtNumero.requestFocus();
            return true;
        }
        return false;
    }

    /**
     * Valida il campo nazionalità
     *
     * @return true se c'è un ERRORE, false se è valido
     */
    public boolean erroreNazionalita(JTextField txtNazionalita) {
        String nazionalita = txtNazionalita.getText().trim();
        if (nazionalita.isEmpty() || nazionalita.matches(".*\\d.*")) {
            messaggio = "Il campo Nazionalità non può essere vuoto o contenere numeri!";
            txtNazionalita.requestFocus();
            return true;
        }
        return false;
    }

    /**
     * Valida il campo prestazione
     *
     * @return true se c'è un ERRORE, false se è valido
     */
    public boolean errorePrestazione(JTextField txtPrestazione) {
        String prestazioneText = txtPrestazione.getText().trim();
        // Controlla che non sia vuoto e contenga solo numeri PRIMA di convertirlo
        if (prestazioneText.isEmpty() || !prestazioneText.matches("\\d+")) {
            messaggio = "Il campo Prestazione non è valido o è vuoto!";
            txtPrestazione.requestFocus();
            return true;
        }

        int prestazione = Integer.parseInt(prestazioneText);
        if (prestazione <= 0 || prestazione > 11) {
            messaggio = "La Prestazione deve essere compresa tra 1 e 11!";
            txtPrestazione.requestFocus();
            return true;
        }
        return false;
    }
}

}
