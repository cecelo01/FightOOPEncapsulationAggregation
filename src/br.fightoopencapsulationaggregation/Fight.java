/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.fightoopencapsulationaggregation;

import java.util.Random;

/**
 *
 * @author Marce
 */
public class Fight{
    
    private Fighter desafiado;
    private Fighter desafiante;
    private int rouds;
    private boolean aprovada;

    
    public void marcarLuta(Fighter l1, Fighter l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.setAprovada(true);
            this.desafiado = l1;
            this.desafiante = l2;
        }else{
            this.setAprovada(false);
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    
    public void lutar(){
        if (this.getAprovada()){
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            
            switch (vencedor) {
                    case 0 -> {
                        System.out.println("---------------------------------");
                        System.out.println("Empate");
                        this.desafiado.empatarLuta();
                        this.desafiante.empatarLuta();
                }
                case 1 -> {
                    System.out.println("---------------------------------");
                    System.out.println("Vitoria do "+ this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                }
                case 2 -> {
                    System.out.println("---------------------------------");
                    System.out.println("Virotia do "+this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                }
            }
        }else{
            System.out.println("A luta nao pode acontecer");
        }
    
    }
    
    
    public Fighter getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Fighter desafiado) {
        this.desafiado = desafiado;
    }

    public Fighter getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Fighter desafiante) {
        this.desafiante = desafiante;
    }

    public int getRouds() {
        return rouds;
    }

    public void setRouds(int rouds) {
        this.rouds = rouds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
    
}
