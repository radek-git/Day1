package com;

import java.util.Scanner;

public class Table {

    public static void main(String[] args) {


//        int[] table = new int[3];
//        System.out.println(table.length);
//        table[0] = 1;
//        table[1] = 2;
//        table[2] = 3;
//
//
//        System.out.println(table[2]);
//        for (int i = 0; i < table.length; i++) {
//            System.out.println(table[i]);
//        }
//
//        for (int i : table) {
//            System.out.println(i);
//        }

        Scanner sc = new Scanner(System.in);
//        String[] names = new String[5];
//        System.out.println("Podaj 1-sze imię");
//        names[0] = sc.nextLine();
//
//        System.out.println("Podaj 2-gie imię");
//        names[1] = sc.nextLine();
//
//        System.out.println("Podaj 3-cie imię");
//        names[2] = sc.nextLine();
//
//        System.out.println("Podaj 4-te imię");
//        names[3] = sc.nextLine();
//
//        System.out.println("Podaj 5-te imię");
//        names[4] = sc.nextLine();
//
//        for (int i = 0; i < names.length; i++) {
//            System.out.println("Witaj " + names[i]);
//        }
//
//        for (String name : names) {
//            System.out.println(name);
//        }


        System.out.println("Podaj liczbę: ");
        int number = sc.nextInt();
        int[] tab = new int[number];

        for (int i = 0; i < number; i++) {
            tab[i] = i + 1;
        }

        for (int i : tab) {
            System.out.println(i);
        }




    }
}
