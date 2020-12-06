package com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        System.out.println("test");
//
//        int x = 10;
//
//        if (x % 2 == 0) {
//            System.out.println("jest to liczba parzysta");
//        } else {
//            System.out.println("Liczba jest nieparzysta");
//        }
//
//        if (x > 10) {
//            System.out.println("LIczba jest większa od 10");
//        } else if (x == 10) {
//            System.out.println("Liczba jest równa 10");
//        } else {
//            System.out.println("Liczba jest mniejsza od 10");
//        }


        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę a");
        int a = sc.nextInt();

        System.out.println("Podaj liczbę b");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("a jest większe od b");
        } else if (a == b) {
            System.out.println("a = b");
        } else {
            System.out.println("a jest mniejsze od b");
        }








    }
}
