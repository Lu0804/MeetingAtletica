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
public abstract class Gara {
    protected ArrayList<Atleta> partecipanti;
    protected String nome;

    public Gara(ArrayList<Atleta> partecipanti, String nome) {
        this.partecipanti = partecipanti;
        this.nome = nome;
    }
    public abstract void iscrizione(Atleta atleta);
    public abstract void graduatoria();
}
