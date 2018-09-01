/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

/**
 *
 * @author Anders Gulstad 2018
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Deklarera och initiera tre variabler
        int antalApelsiner = 5;
        int antalApplen = 10;
        int antalFrukter = 0;

        antalFrukter = antalApelsiner + antalApplen;

        // Visa resultatet
        System.out.println("Ett fruktsamt program");
        System.out.println("Totala antal frukter är " + antalFrukter);

        // +++ Kod för att göra ett uppehåll innan pgm avslutas +++
        //System.out.println("---- Tryck Enter för att avsluta ----");
        //try
        //{
        //  System.in.read();
        //}
        //catch (IOException e)
        //{
        //    return;
        //}
    }
}