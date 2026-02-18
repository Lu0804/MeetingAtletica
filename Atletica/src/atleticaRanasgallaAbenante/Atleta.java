/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atleticaRanasgallaAbenante;

/**
 *
 * @author utente
 */
public abstract class Atleta {
    protected String nome;
    protected int numero;
    protected String nazionalita;
    protected int prestazione;
/**
 * costruttore
 * @param nome nome atleta
 * @param numero numero della maglia
 * @param nazionalita nazionalità dell'atleta
 * @param prestazione prestazionedell'atleta
 */

    public Atleta(String nome, int numero, String nazionalita, int prestazione) {
        this.nome = nome;
        this.numero = numero;
        this.nazionalita = nazionalita;
        this.prestazione = prestazione;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNazionalita() {
        return nazionalita;
    }

    public void setNazionalita(String nazionalita) {
        this.nazionalita = nazionalita;
    }

    public int getPrestazione() {
        return prestazione;
    }

    public void setPrestazione(int prestazione) {
        this.prestazione = prestazione;
    }
}
