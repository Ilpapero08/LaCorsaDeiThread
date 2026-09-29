package com.example;

public class Main {
    public static void main(String[] args) {
        Corridore a = new Corridore("Corridore A");
        Corridore b = new Corridore("Corridore B");

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.getMessage();
        }
        System.out.println("Gara terminata!!!");
    }
}