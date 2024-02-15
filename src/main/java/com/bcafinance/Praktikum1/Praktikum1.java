package com.bcafinance.Praktikum1;/*
IntelliJ IDEA 2023.1.3 (Community Edition)
Build #IC-231.9161.38, built on June 20, 2023
@Author Acer-01 a.k.a. Bima Prakoso
Java Developer
Created on 15/02/2024 15:04
@Last Modified 15/02/2024 15:04
Version 1.0
*/

import java.util.Scanner;

public class Praktikum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Kata : ");
        char [] charInput = sc.nextLine().toCharArray();
        int result = 0;
        for(int i = 0; i < charInput.length; i++) {
            int val = charInput[i];
            if(val < 97) {
                result += val;
            }
        }
        System.out.println("Hasil :" + result);
    }
}