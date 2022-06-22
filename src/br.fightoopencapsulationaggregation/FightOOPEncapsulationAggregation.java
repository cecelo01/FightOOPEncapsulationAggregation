/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.fightoopencapsulationaggregation;

/**
 *
 * @author Marce
 */
public class FightOOPEncapsulationAggregation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Fighter l[] = new Fighter[6];
        
        l[0] = new Fighter("Pretty Boy", "Franca", 31, 1.75f, 68.9f, 11, 3, 1);
        l[1] = new Fighter("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        l[2] = new Fighter("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        l[3] = new Fighter("Dead Code", "Australia", 28, 1.93f, 81.6f, 13, 0, 2);
        l[4] = new Fighter("OFUCobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        l[5] = new Fighter("Nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
        
          
        Fight UEC01 = new Fight();
        
        UEC01.marcarLuta(l[0], l[1]);
        UEC01.lutar();
        l[0].status();
        l[1].status();
        

    }
    
}
