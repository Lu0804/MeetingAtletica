/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atleticaRanasgallaAbenante;
import java.util.*;
/**
 *
 * @author utente
 * Classe astratta gara da dove erediteranno tutte le gare 
 */
public abstract class Gara {

    protected ArrayList<Atleta> partecipanti;
    protected String nome;

    /**
     * costruttore
     *
     * @param partecipanti array di atleti della gara
     * @param nome  nome della gara
     */
    public Gara(ArrayList<Atleta> partecipanti, String nome) {
        this.partecipanti = partecipanti;
        this.nome = nome;
    }

    // Get & Set
    public ArrayList<Atleta> getPartecipanti() {
        return partecipanti;
    }

    public String getNome() {
        return nome;
    }

    public void setPartecipanti(ArrayList<Atleta> partecipanti) {
        this.partecipanti = partecipanti;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * metodo astratto per l'iscrizione dell'atleta nella gara
     *
     * @param atleta atleta che si iscrive alla gara
     */
    public abstract void iscrizione(Atleta atleta);

    /**
     * metodo astratto del calcolo della graduatoria
     *
     * @return la graduatoria della gara
     */
    public abstract String graduatoria();

    /**
     * metodo astratto del calcolo punteggio per ogni atleta
     *
     * @return un array grande quanto sono i partecipanti con parametri
     * partecipanti e la loro posizione, i range delle gare a secondo del tipo
     */
    public abstract double[] calcolaTuttiPunteggi();

    /**
     * metodo che a secodno della gare ordina in modo cersente o decrescete gli
     * atleti con il loro punteggio usando due array paralleli
     *
     * @param punteggi array dei punteggi per ogni atleta
     */
    public abstract void ordinaClassifica(double[] punteggi);

    /**
     * metodo astratto della stampa della classifica
     *
     * @param punteggi array dei punteggi per ogni atleta
     * @return
     */
    public abstract String stampaClassifica(double[] punteggi);

    /**
     * metodo astratto per il calcolo del punteggio del singolo atleta
     *
     * @param a Atleta
     * @param punteggio il puntaggio da calcolare
     * @param rnd randome per il range
     * @return il punteggio del singolo atleta
     */
    public abstract double calcolo(Atleta a, double punteggio, Random rnd);
}
