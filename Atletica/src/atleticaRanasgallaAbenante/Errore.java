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
    /**
     * metodo per il controllo duplicazione di atletli
     * @param a atleta 
     * @param p array dei partecipanti 
     */
    public void duplicatiAtleta(Atleta a, ArrayList<Atleta> p){
        if(p.contains(a)) System.out.println("DUPLICATO");
        else{
            p.add(a);
        }   
    }
    
    /**
     * metodo per il controllo duplicazione di atletli
     * @param g gara 
     * @param p array dei partecipanti
     */
    public void duplicatiGare(Gara g, ArrayList<Gara> p){
        if(p.contains(g)) System.out.println("DUPLICATO");
        else{
            p.add(g);
        }
    }
  /**
     * Valida il campo nome
     * @param txtNome campo di testo del nome
     * @return true se valido, false altrimenti
     */
    public boolean validaNome(JTextField txtNome) {
        String nome = txtNome.getText().trim();
        if (nome.isEmpty()) {
            mostraErrore("Il campo Nome non può essere vuoto!");
            txtNome.requestFocus();
            return false;
        }
        if (!nome.matches("^[a-zA-ZÀ-ÿ\\s'-]+$")) {
            mostraErrore("Il Nome può contenere solo lettere, spazi, apostrofi e trattini!");
            txtNome.requestFocus();
            return false;
        }
        return true;
    }
    
    /**
     * Valida il campo numero
     * @param txtNumero campo di testo del numero
     * @return il numero se valido, -1 altrimenti
     */
    public int validaNumero(JTextField txtNumero) {
        String numeroText = txtNumero.getText().trim();
        if (numeroText.isEmpty()) {
            mostraErrore("Il campo Numero non può essere vuoto!");
            txtNumero.requestFocus();
            return -1;
        }
        try {
            int numero = Integer.parseInt(numeroText);
            if (numero <= 0) {
                mostraErrore("Il Numero deve essere un valore positivo!");
                txtNumero.requestFocus();
                return -1;
            }
            return numero;
        } catch (NumberFormatException e) {
            mostraErrore("Il Numero deve contenere solo cifre numeriche!");
            txtNumero.requestFocus();
            return -1;
        }
    }
    
    /**
     * Valida il campo nazionalità
     * @param txtNazionalita campo di testo della nazionalità
     * @return true se valido, false altrimenti
     */
    public boolean validaNazionalita(JTextField txtNazionalita) {
        String nazionalita = txtNazionalita.getText().trim();
        if (nazionalita.isEmpty()) {
            mostraErrore("Il campo Nazionalità non può essere vuoto!");
            txtNazionalita.requestFocus();
            return false;
        }
        if (!nazionalita.matches("^[a-zA-ZÀ-ÿ\\s'-]+$")) {
            mostraErrore("La Nazionalità può contenere solo lettere!");
            txtNazionalita.requestFocus();
            return false;
        }
        return true;
    }
    
    /**
     * Valida il campo prestazione
     * @param txtPrestazione campo di testo della prestazione
     * @return la prestazione se valida, -1 altrimenti
     */
    public int validaPrestazione(JTextField txtPrestazione) {
        String prestazioneText = txtPrestazione.getText().trim();
        if (prestazioneText.isEmpty()) {
            mostraErrore("Il campo Prestazione non può essere vuoto!");
            txtPrestazione.requestFocus();
            return -1;
        }
        try {
            int prestazione = Integer.parseInt(prestazioneText);
            if (prestazione <= 0) {
                mostraErrore("La Prestazione deve essere un valore positivo!");
                txtPrestazione.requestFocus();
                return -1;
            }
            return prestazione;
        } catch (NumberFormatException e) {
            mostraErrore("La Prestazione deve contenere solo cifre numeriche!");
            txtPrestazione.requestFocus();
            return -1;
        }
    }
    
    /**
     * Mostra un messaggio di errore
     * @param messaggio il messaggio da mostrare
     */
    private void mostraErrore(String messaggio) {
        JOptionPane.showMessageDialog(null, 
            messaggio, 
            "Errore di validazione", 
            JOptionPane.ERROR_MESSAGE);
    }   
    
}
