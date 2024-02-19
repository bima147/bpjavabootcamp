package com.bcafinance.testharian;

/*
IntelliJ IDEA 2023.1.3 (Community Edition)
Build #IC-231.9161.38, built on June 20, 2023
@Author Acer-01 a.k.a. Bima Prakoso
Java Developer
Created on 19/02/2024 16:40
@Last Modified 19/02/2024 16:40
Version 1.0
*/

import java.util.Scanner;

public class PraktikumJavaBasicLogic {
    public static void main(String[] args) {
        double x = 0;
        int y = 0;
        boolean a = true;
        Scanner sc = new Scanner(System.in);
        try {
            while(a) {
                x += sc.nextInt();
                y += 1;
            }
        } catch(Exception e) {
            System.out.println(x/y);
        }
    }
}