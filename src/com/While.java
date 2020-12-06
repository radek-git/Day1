package com;

import java.util.Scanner;

public class While {

    public static void main(String[] args) {

//        int counter = 10;
//
//        while (counter < 5) {
//            System.out.println("to jest pętla while " + counter);
//            counter++;
//        }
//
//        int count = 10;
//
//        do {
//            System.out.println("Pętla do-while " + count);
//            count++;
//        } while (count < 5);




        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę sekund do wybuchu: ");
        int number = sc.nextInt();

        do {
            System.out.println("Bomba wybuchnie za " + number + " sec");
            number--;
        } while (number >= 0);


        while (number >= 0) {
            System.out.println("Bomba wybuchnie za " + number + " sec");
            number--;
        }


        for (int i = number; i >= 0; i--) {
            System.out.println("Bomba wybuchnie za " + number + " sec");
            number--;
        }


    }



}
