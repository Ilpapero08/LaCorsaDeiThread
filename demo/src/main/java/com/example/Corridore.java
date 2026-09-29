package com.example;

public class Corridore extends Thread{
    private String nome_corridore;

    public Corridore(String nome){
        this.nome_corridore = nome;
    }

    @Override 
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("Corridore " + this.nome_corridore + " ha fatto il passo " + i);
            try {
                Thread.sleep((int) (Math.random()*(800-200+1))+200);
            } catch (InterruptedException e) {
                e.getMessage();
            }
        }
        System.out.println("Il Corridore " + nome_corridore + " e' arrivato al traguardo");
    }
}
