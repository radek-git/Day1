package com;

public class Zad1 {

    public static void main(String[] args) {

        int[] tab = {1, 2, 3, 4, 5};

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(tab[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }
}
