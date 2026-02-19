/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atleticaRanasgallaAbenante;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author utente
 */
import javax.swing.JTextField;
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
    public boolean erroreNome(JTextField txtNome) {
        String nome = txtNome.getText().trim();
        if (nome.isEmpty() ) {
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
    public boolean erroreNumero(JTextField txtNumero) {
        String numeroText = txtNumero.getText().trim();
        int numero = Integer.parseInt(numeroText);
        if (numeroText.isEmpty() || numero <= 0)  {
            mostraErrore("Il campo Numero maglia non è valido");
            txtNumero.requestFocus();
            return true;
        }
      return false;  
    }
    
    /**
     * Valida il campo nazionalità
     * @param txtNazionalita campo di testo della nazionalità
     * @return true se valido, false altrimenti
     */
    public boolean erroreNazionalita(JTextField txtNazionalita) {
        String nazionalita = txtNazionalita.getText().trim();
        if (nazionalita.isEmpty()) {
            mostraErrore("Il campo Nazionalità non può essere vuoto!");
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
    public boolean errorePrestazione(JTextField txtPrestazione) {
        String prestazioneText = txtPrestazione.getText().trim();
        int prestazione = Integer.parseInt(prestazioneText);
        if (prestazioneText.isEmpty() || prestazione <= 0 || prestazione > 11) {
            mostraErrore("Il campo Prestazione non può essere vuoto!");
            txtPrestazione.requestFocus();
            return true;
        }
        return false;
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
