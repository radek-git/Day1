package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj n:");
        int liczba = scan.nextInt();
        String pierwsze = "";
        for (int i = 2; i <= liczba; i++) {
            if (isPrimary(i)) {
                pierwsze += " " + i;
            }
        }
        System.out.println("Liczby pierwsze do " + liczba + " to " + pierwsze);

    }

    public static boolean isPrimary(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;

    }



}








