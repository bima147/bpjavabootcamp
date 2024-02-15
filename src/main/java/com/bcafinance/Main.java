package com.bcafinance;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // random value dari 5-10
        Random rand = new Random();
        for(int i=0;i<10;i++)
        {
            System.out.println("Random Number "+i+" -> "+rand.nextInt(5,10));
        }
    }
}