/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package atleticaRanasgallaAbenante;

/**
 *
 * @author abenante.lucia
 */
public interface IPunteggio {
    /**
     *calcola il punteggio a secondo della gara
     * @param a atleta per prendere la prestazione
     * @param range1 rannge minimo
     * @param range2 range massimo
     * @return distanza del salto
     */
   public abstract double calcoloPunteggio(Atleta a,int range1,int range2); 
}
