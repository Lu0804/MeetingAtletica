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

    /**
     * Valida il campo numero
     *
     * @param txtNumero campo di testo del numero
     * @return il numero se valido, -1 altrimenti
     */
    public boolean erroreNumero(JTextField txtNumero) {
        String numeroText = txtNumero.getText();

        if (numeroText.isEmpty() || numeroText.matches(".*[a-zA-Z].*")) {
            messaggio = "Il campo Numero maglia non è valido";
            txtNumero.requestFocus();
            return true;

        }
        int numero = Integer.parseInt(numeroText);
        if (numero <= 0) {
            messaggio = "Il campo Numero maglia non è valido";
            txtNumero.requestFocus();
            return true;
        }
        return false;
    }

    /**
     * Valida il campo nazionalità
     *
     * @param txtNazionalita campo di testo della nazionalità
     * @return true se valido, false altrimenti
     */
    public boolean erroreNazionalita(JTextField txtNazionalita) {
        String nazionalita = txtNazionalita.getText();
        if (nazionalita.isEmpty() || nazionalita.matches(".*\\d.*")) {
            messaggio = "Il campo Nazionalità non può essere vuoto!";

            return false;
        }

        return true;
    }

    /**
     * Valida il campo prestazione
     *
     * @param txtPrestazione campo di testo della prestazione
     * @return se prestazione ha valori validi
     */
    public boolean errorePrestazione(JTextField txtPrestazione) {
        String prestazioneText = txtPrestazione.getText();
        int prestazione = Integer.parseInt(prestazioneText);
        if (prestazioneText.isEmpty()) {
            messaggio = "Il campo Prestazione non può essere vuoto!";

            return true;
        }

        if (prestazione <= 0 || prestazione > 11) {
            messaggio = "Il campo Prestazione non può essere vuoto!";

            return true;
        }
        return false;
    }

}
