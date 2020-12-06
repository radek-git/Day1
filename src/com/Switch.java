package com;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

//        int y = 9;
//
//        switch (y) {
//            case 3:
//                System.out.println("Liczba 3");
//                break;
//            case 2:
//                System.out.println("Liczba 2");
//                break;
//            case 1:
//                System.out.println("Liczba 1");
//                break;
//            default:
//                System.out.println("to jest inna liczba");
//        }


        Scanner sc = new Scanner(System.in);

//        System.out.println("Podaj imię");
//        String name = sc.nextLine();
//
//        switch (name) {
//            case "Radek":
//                System.out.println("Cześć " + name);
//                break;
//            case "Anna":
//                System.out.println("Cześć " + name);
//                break;
//
//                case "Ryś":
//                System.out.println("Cześć "+ name);
//                break;
//
//            default:
//                System.out.println("Inne imię");
//        }


        System.out.println("Podaj owoc: ");
        String owoc = sc.nextLine();

        System.out.println("Podaj ilość: ");
        int ilosc = sc.nextInt();

        switch (owoc) {
            case "jabłko":
                countFruits(owoc, ilosc, "jabłek jest za dużo o ");
                break;

            case "banan":
                countFruits(owoc, ilosc, "bananów jest za dużo o ");

            case "pomarańcza":
                countFruits(owoc, ilosc, "pomarańczy jest za dużo o ");

            default:
                System.out.println("Inny owoc");
        }


    }

    private static void countFruits(String owoc, int ilosc, String s) {
        if (ilosc > 100) {
            System.out.println(s + (ilosc - 100));
        } else {
            System.out.println(owoc + " jest w sam raz, pozostało jeszcze " + (100 - ilosc) + " kg miejsca");
        }
        return;
    }
}
